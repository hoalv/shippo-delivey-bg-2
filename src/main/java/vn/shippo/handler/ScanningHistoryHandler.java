package vn.shippo.handler;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.shippo.entities.operation_service.ScanningHistory;
import vn.shippo.exception.DeliveryOrderNotFoundException;
import vn.shippo.service.DeliveryOrderService;

public class ScanningHistoryHandler extends BaseCDCHandler<ScanningHistory> {
    Logger log = LoggerFactory.getLogger("ScanningHistoryHandler");
    public ScanningHistoryHandler(JSONObject event, ConsumerRecord record) {
        _event = event;
        _record = record;
        _entityClazz = ScanningHistory.class;

        super._init();
    }

    @Override
    public void process() {
        if (_CRUDOperation == 'c') { //scanning history only create new _after scan a barcode
            if (null != _after.getOrderId()) {
                try {
                    DeliveryOrderService.updateFollowScan(_after, null, log);
                } catch (DeliveryOrderNotFoundException orderNotFoundException) {
                    log.warn("Order not found with barcode " +_after.getOrderBarcode());
                }
            } else {
                log.info("Scanned barcode not matches with any order");
            }
        }
    }
}
