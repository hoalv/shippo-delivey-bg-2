package vn.shippo.handler;

import org.json.JSONObject;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.velacorp.kafka.IRecordHandler;

import java.util.HashMap;
import java.util.Map;

public class RecordHandler implements IRecordHandler {
    private static Logger _logger = LoggerFactory.getLogger("KafkaConsumer");
    private ConsumerRecord<String, byte[]> _record;
    public RecordHandler(ConsumerRecord<String, byte[]> record) {
        _record = record;
    }

    @Override
    public void run() throws NullPointerException {
        String eventInString = new String(_record.value());
        _logger.debug(eventInString);
        JSONObject eventValue = new JSONObject(eventInString);
        try {
            IHandler handler = getHandlerByTopic(_record.topic(), eventValue, _record);
            handler.process();
            _logger.info("Process with" +handler.getClass().getName());
        } catch (HandlerNotFoundException e) {
            _logger.warn(e.getMessage());
        } catch (Exception e) {
            _logger.error(e.getMessage(), e);
        }
    }

    private static Map<String, IHandler> handlers = new HashMap<>();

    public static IHandler getHandlerByTopic(String topic, JSONObject event, ConsumerRecord record) {
        switch (topic) {
            case "test_scanning_histories":
                return new ScanningHistoryHandler(event, record);
        }
        throw new HandlerNotFoundException("Could not found any handler with topic " + topic);
    }
}
