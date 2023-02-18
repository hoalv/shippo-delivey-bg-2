package vn.velacorp.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleConsumer<T extends IRecordHandler> {
    private Long _pollTime;
    private KafkaConsumer<String, byte[]> _kafkaConsumer;
    private ExecutorService executor;
    private Class<T> _recordHandlerClass;
    private static Logger logger = LoggerFactory.getLogger("KafkaConsumer");
//    private Serde _serde;

    public SingleConsumer(Class<T> recordHandlerClass, String brokers, String groupId,
                          List<String> topic, Long pollTime, Map<String, Object> options) {
        Properties props = new Properties();
        props.put("bootstrap.servers", brokers);
        props.put("group.id", groupId);
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("session.timeout.ms", "30000");
        props.put("auto.offset.reset", "earliest");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.ByteArrayDeserializer");

        options.forEach(props::put);
        logger.info("Consumer option {}", props);

        _recordHandlerClass = recordHandlerClass;
//        _serde = serde;

        _kafkaConsumer = new KafkaConsumer<>(props);
        _kafkaConsumer.subscribe(topic);
        _pollTime = pollTime;
    }

    public void execute(int threads) {
        long count = 0;
        executor = Executors.newFixedThreadPool(threads);
        while (true) {
            ConsumerRecords<String, byte[]> records = _kafkaConsumer.poll(_pollTime);
            logger.info("Hello, im still alive " + new Date() +" received " + count + " records");
            for (final ConsumerRecord record:records) {
                count++;
                //log count
                try {
                    Constructor<T> constructor = _recordHandlerClass.getConstructor(record.getClass());
                    executor.submit(constructor.newInstance(record));;
                    logger.info(String.format("Consumer Record:(%d, %d, %d, %s %s)",
                            count, record.partition(), record.offset(),
                            record.topic(), record.key()));
                    _kafkaConsumer.commitSync();
                } catch (Exception e) {
                    logger.error(e.getMessage(), e);
                }
            }
        }
    }

    public KafkaConsumer getConsumer() {
        return _kafkaConsumer;
    }

    public void shutdown() {
        if (_kafkaConsumer != null) {
            _kafkaConsumer.close();
        }
        if (executor != null) {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(5000, TimeUnit.MILLISECONDS)) {
                    logger.error("Timed out waiting for consumer threads to shut down, exiting uncleanly");
                }
            } catch (InterruptedException e) {
                logger.error("Interrupted during shutdown, exiting uncleanly {}", e);
            }
        }
    }
}
