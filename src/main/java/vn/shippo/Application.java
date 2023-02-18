package vn.shippo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.velacorp.Registry;
import vn.velacorp.kafka.SingleConsumer;

import java.util.Properties;

public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try {
            //load config first
            Properties properties = Registry.loadConfig();
            int threadsNo = Integer.parseInt(String.valueOf(properties.getProperty("threads_no", "1")));
            SingleConsumer kafkaConsumer = Factory.getKafkaConsumer();
            logger.info("Application run with " +threadsNo + "threads");

            kafkaConsumer.execute(threadsNo);
//            Thread.sleep(1000);

            //shutdown hook for CtrlC or service restarts(i.e. graceful shutdown)
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                logger.info("Got Cntrl-C, shutting down by kill switch");
                kafkaConsumer.shutdown();
            }));

        } catch (Exception e) {
            logger.error("Something went wrong {}", e);
        }

        //register incoming kafka message listener
//        _registerEventListener();
    }

//    private static void _registerEventListener() {
//        IDispatcher dispatcher = Dispatcher.get(KafkaMessageDispatcher.class);
//
//        dispatcher.register(EventMessage.class, event -> {
//            switch (event.getEvent()) {
//                case "createNewDeliveryOrderExport":
//                    ActorManager.getActor(ActorManager.DeliveryOrderExportAnalyzer).tell(event, ActorRef.noSender());
//                    break;
//                default:
//                    //log warning
//            }
//        });
//    }
}