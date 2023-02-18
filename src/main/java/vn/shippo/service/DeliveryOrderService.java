package vn.shippo.service;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.shippo.entities.delivery_service.DeliveryOrder;
import vn.shippo.entities.delivery_service.OrderComment;
import vn.shippo.entities.operation_service.ScanningHistory;
import vn.shippo.exception.DeliveryOrderNotFoundException;
import vn.velacorp.Registry;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class DeliveryOrderService {
    private static Logger _logger = LoggerFactory.getLogger(DeliveryOrderService.class);

    public static DeliveryOrder getByBarcode(String barcode) {
        EbeanServer server = Ebean.getServer(Registry.getProperties().getProperty("datasource.delivery_service"));

        DeliveryOrder order = server.find(DeliveryOrder.class)
                .where()
                .and()
                .eq("barcode", barcode)
                .endAnd()
                .findUnique();
        
        return order;
    }

    public static void updateFollowScan(ScanningHistory scanningHistory, Transaction transaction, Logger logger) throws DeliveryOrderNotFoundException {
        if (null == logger) logger = _logger;
        EbeanServer server = Ebean.getServer(Registry.getProperties().getProperty("datasource.delivery_service"));
        if (null == transaction) {
            transaction = server.beginTransaction();
        }

        try {
            addCommentFollowScan(scanningHistory, transaction);
            logger.info(String.format("Add order[%d] comment follow scanning history[%d]", scanningHistory.getOrderId(), scanningHistory.getId()));

            updateStateFollowScan(scanningHistory, transaction, logger);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public static void updateStateFollowScan(ScanningHistory scanningHistory, Transaction transaction, Logger logger) throws DeliveryOrderNotFoundException {
        if (null == logger) logger = _logger;

        DeliveryOrder order = getByBarcode(scanningHistory.getOrderBarcode());
        if (null == order) {
            throw new DeliveryOrderNotFoundException("Order not found with barcode " +scanningHistory.getOrderBarcode());
        }
        if (scanningHistory.getAction().equals("INTO_HUB")) {
            updateFollowScanIn(order, scanningHistory, transaction);
            logger.info(String.format("Update order [%d] follow scanned in[%d]", order.getId(), scanningHistory.getId()));
        } else if(scanningHistory.getAction().equals("OUT_OF_HUB")) {
            updateFollowScanOut(order, scanningHistory, transaction);
            logger.info(String.format("Update order [%d] follow scanned out[%d]", order.getId(), scanningHistory.getId()));
        }
    }

    public static void updateFollowScanOut(DeliveryOrder order, ScanningHistory scanningHistory, Transaction transaction) {
        EbeanServer server = Ebean.getServer(Registry.getProperties().getProperty("datasource.delivery_service"));
        order.setCurrentWarehouseState("OUT");
        order.setExportWarehouseAt(new Timestamp(System.currentTimeMillis()));
        order.setUpdatedAt(order.getExportWarehouseAt());
        order.setCurrentWarehouseId(scanningHistory.getHubId());
        order.increaseVersion();
        server.update(order, transaction);
    }

    public static void updateFollowScanIn(DeliveryOrder order, ScanningHistory scanningHistory, Transaction transaction) {
    }

    public static void addCommentFollowScan(ScanningHistory scanningHistory, Transaction transaction) {
        EbeanServer server = Ebean.getServer(Registry.getProperties().getProperty("datasource.delivery_service"));
        OrderComment orderComment = new OrderComment();
        orderComment.setCommentObject("DeliveryOrder");
        orderComment.setCommentSource("ACTIVITY");
        orderComment.setScope("INTERNAL");
        orderComment.setCreated_user_id(scanningHistory.getActionBy());
        orderComment.setOrderId(scanningHistory.getOrderId());
//        orderComment.setContent(DeliveryOrderService._buildJsonContent(scanningHistory));
        orderComment.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        orderComment.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        orderComment.setVersion(0);

        if (null != transaction) {
            server.insert(orderComment, transaction);
        } else {
            server.insert(orderComment);
        }
    }

    private static Object _buildJsonContent(ScanningHistory scanningHistory) {
        Map<String,Object> content = new HashMap<>();
        Map<String,Object> _attributes = new HashMap<>();
        _attributes.put("ip", "0.0.0.0");
        _attributes.put("agent", Registry.getProperties().getProperty("application_name"));

        /** @FIXME Apply I18n */
        if(scanningHistory.getAction().equals("INTO_HUB")){
            _attributes.put("action", "BARCODE_IN");
            _attributes.put("description", "quét " + scanningHistory.getBarcode() + " nhập kho " + scanningHistory.getHubCode());
        } else if(scanningHistory.getAction().equals("OUT_OF_HUB")){
            _attributes.put("action", "BARCODE_OUT");
            _attributes.put("description", "quét " + scanningHistory.getBarcode() + " xuất kho " + scanningHistory.getHubCode());
        } else {
            _attributes.put("action", "INVENTORY");
            _attributes.put("description", "quét " + scanningHistory.getBarcode() + " kiểm kê " + scanningHistory.getHubCode());
        }

        content.put("_type", "ACTIVITY");
        content.put("_attributes", _attributes);
        return content;
    }
}
