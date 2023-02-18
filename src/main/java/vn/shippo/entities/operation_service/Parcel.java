package vn.shippo.entities.operation_service;

import com.avaje.ebean.annotation.DbJson;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the parcels database table.
 * 
 */
@Entity
@Table(name="parcels")
@NamedQuery(name="Parcel.findAll", query="SELECT p FROM Parcel p")
public class Parcel implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="actual_cod")
	@SerializedName("actual_cod")
	@JsonProperty("actual_cod")
	private Double actualCod;

	private String barcode;

	@Column(name="cancelled_at")
	@SerializedName("cancelled_at")
	@JsonProperty("cancelled_at")
	private Timestamp cancelledAt;

	private Double cod;

	private String consignee;

	@Column(name="consignee_detail_address")
	@SerializedName("consignee_detail_address")
	@JsonProperty("consignee_detail_address")
	private String consigneeDetailAddress;

	@Column(name="consignee_phone")
	@SerializedName("consignee_phone")
	@JsonProperty("consignee_phone")
	private String consigneePhone;

	@Column(name="created_at")
	@SerializedName("created_at")
	@JsonProperty("created_at")
	private Timestamp createdAt;

	@Column(name="current_warehouse_code")
	@SerializedName("current_warehouse_code")
	@JsonProperty("current_warehouse_code")
	private String currentWarehouseCode;

	@Column(name="current_warehouse_id")
	@SerializedName("current_warehouse_id")
	@JsonProperty("current_warehouse_id")
	private Integer currentWarehouseId;

	@DbJson
	@Column(name="custom_fields")
	@SerializedName("custom_fields")
	@JsonProperty("custom_fields")
	private Object customFields;

	@Column(name="delivery_date")
	@SerializedName("delivery_date")
	@JsonProperty("delivery_date")
	private Timestamp deliveryDate;

	@Column(name="delivery_due_date")
	@SerializedName("delivery_due_date")
	@JsonProperty("delivery_due_date")
	private Timestamp deliveryDueDate;

	@Column(name="delivery_location_ids_path")
	@SerializedName("delivery_location_ids_path")
	@JsonProperty("delivery_location_ids_path")
	private String deliveryLocationIdsPath;

	@Column(name="delivery_location_names_path")
	@SerializedName("delivery_location_names_path")
	@JsonProperty("delivery_location_names_path")
	private String deliveryLocationNamesPath;

	@Column(name="delivery_notes")
	@SerializedName("delivery_notes")
	@JsonProperty("delivery_notes")
	private String deliveryNotes;

	@Column(name="delivery_shift")
	@SerializedName("delivery_shift")
	@JsonProperty("delivery_shift")
	private String deliveryShift;

	@Column(name="delivery_times")
	@SerializedName("delivery_times")
	@JsonProperty("delivery_times")
	private Integer deliveryTimes;

	@Column(name="delivery_warehouse_code")
	@SerializedName("delivery_warehouse_code")
	@JsonProperty("delivery_warehouse_code")
	private String deliveryWarehouseCode;

	@Column(name="delivery_warehouse_id")
	@SerializedName("delivery_warehouse_id")
	@JsonProperty("delivery_warehouse_id")
	private Integer deliveryWarehouseId;

	@Column(name="done_at")
	@SerializedName("done_at")
	@JsonProperty("done_at")
	private Timestamp doneAt;

	@Column(name="failed_at")
	@SerializedName("failed_at")
	@JsonProperty("failed_at")
	private Timestamp failedAt;

	@DbJson
	private Object features;

	private String goods;

	private Integer height;

	@Column(name="in_process_at")
	@SerializedName("in_process_at")
	@JsonProperty("in_process_at")
	private Timestamp inProcessAt;

	@Column(name="internal_failed_at")
	@SerializedName("internal_failed_at")
	@JsonProperty("internal_failed_at")
	private Timestamp internalFailedAt;

	@Column(name="is_return")
	@SerializedName("is_return")
	@JsonProperty("is_return")
	private Boolean isReturn;

	@Column(name="last_export_at")
	@SerializedName("last_export_at")
	@JsonProperty("last_export_at")
	private Timestamp lastExportAt;

	@Column(name="last_import_at")
	@SerializedName("last_import_at")
	@JsonProperty("last_import_at")
	private Timestamp lastImportAt;

	@Column(name="last_inventory_at")
	@SerializedName("last_inventory_at")
	@JsonProperty("last_inventory_at")
	private Timestamp lastInventoryAt;

	private Integer lenght;

	@Column(name="merchant_id")
	@SerializedName("merchant_id")
	@JsonProperty("merchant_id")
	private Integer merchantId;

	@Column(name="merchant_order_code")
	@SerializedName("merchant_order_code")
	@JsonProperty("merchant_order_code")
	private String merchantOrderCode;

	@Column(name="merchant_username")
	@SerializedName("merchant_username")
	@JsonProperty("merchant_username")
	private String merchantUsername;

	@Column(name="order_code")
	@SerializedName("order_code")
	@JsonProperty("order_code")
	private String orderCode;

	@Column(name="order_id")
	@SerializedName("order_id")
	@JsonProperty("order_id")
	private Integer orderId;

	@Column(name="order_state")
	@SerializedName("order_state")
	@JsonProperty("order_state")
	private String orderState;

	@Column(name="pickup_address_id")
	@SerializedName("pickup_address_id")
	@JsonProperty("pickup_address_id")
	private Integer pickupAddressId;

	@Column(name="pickup_contact")
	@SerializedName("pickup_contact")
	@JsonProperty("pickup_contact")
	private String pickupContact;

	@Column(name="pickup_date")
	@SerializedName("pickup_date")
	@JsonProperty("pickup_date")
	private Timestamp pickupDate;

	@Column(name="pickup_detail_address")
	@SerializedName("pickup_detail_address")
	@JsonProperty("pickup_detail_address")
	private String pickupDetailAddress;

	@Column(name="pickup_due_date")
	@SerializedName("pickup_due_date")
	@JsonProperty("pickup_due_date")
	private Timestamp pickupDueDate;

	@Column(name="pickup_full_address")
	@SerializedName("pickup_full_address")
	@JsonProperty("pickup_full_address")
	private String pickupFullAddress;

	@Column(name="pickup_location_ids_path")
	@SerializedName("pickup_location_ids_path")
	@JsonProperty("pickup_location_ids_path")
	private String pickupLocationIdsPath;

	@Column(name="pickup_location_names_path")
	@SerializedName("pickup_location_names_path")
	@JsonProperty("pickup_location_names_path")
	private String pickupLocationNamesPath;

	@Column(name="pickup_notes")
	@SerializedName("pickup_notes")
	@JsonProperty("pickup_notes")
	private String pickupNotes;

	@Column(name="pickup_phone")
	@SerializedName("pickup_phone")
	@JsonProperty("pickup_phone")
	private String pickupPhone;

	@Column(name="pickup_request_id")
	@SerializedName("pickup_request_id")
	@JsonProperty("pickup_request_id")
	private Integer pickupRequestId;

	@Column(name="pickup_shift")
	@SerializedName("pickup_shift")
	@JsonProperty("pickup_shift")
	private String pickupShift;

	@Column(name="pickup_times")
	@SerializedName("pickup_times")
	@JsonProperty("pickup_times")
	private Integer pickupTimes;

	@Column(name="pickup_warehouse_code")
	@SerializedName("pickup_warehouse_code")
	@JsonProperty("pickup_warehouse_code")
	private String pickupWarehouseCode;

	@Column(name="pickup_warehouse_id")
	@SerializedName("pickup_warehouse_id")
	@JsonProperty("pickup_warehouse_id")
	private Integer pickupWarehouseId;

	@Column(name="receiver_payment_amount")
	@SerializedName("receiver_payment_amount")
	@JsonProperty("receiver_payment_amount")
	private double receiverPaymentAmount;

	@Column(name="reject_at")
	@SerializedName("reject_at")
	@JsonProperty("reject_at")
	private Timestamp rejectAt;

	private String state;

	@Column(name="total_fee")
	@SerializedName("total_fee")
	@JsonProperty("total_fee")
	private double totalFee;

	@Column(name="total_merchant_fee")
	@SerializedName("total_merchant_fee")
	@JsonProperty("total_merchant_fee")
	private double totalMerchantFee;

	@DbJson
	@Column(name="transit_failure_notes")
	@SerializedName("transit_failure_notes")
	@JsonProperty("transit_failure_notes")
	private Object transitFailureNotes;

	@Column(name="updated_at")
	@SerializedName("updated_at")
	@JsonProperty("updated_at")
	private Timestamp updatedAt;

	@Column(name="user_id")
	@SerializedName("user_id")
	@JsonProperty("user_id")
	private Integer userId;

	private Integer version;

	private Integer volume;

	@Column(name="warehouse_state")
	@SerializedName("warehouse_state")
	@JsonProperty("warehouse_state")
	private String warehouseState;

	private Integer weight;

	private Integer width;

	@Column(name="consignee_code")
	@SerializedName("consignee_code")
	@JsonProperty("consignee_code")
	private String consigneeCode;

	@Column(name="confirmed_consignee_code")
	@SerializedName("confirmed_consignee_code")
	@JsonProperty("confirmed_consignee_code")
	private String confirmedConsigneeCode;

	@Column(name="delivery_schedule_notes")
	@SerializedName("delivery_schedule_notes")
	@JsonProperty("delivery_schedule_notes")
	private String deliveryScheduleNotes;

	@Temporal(TemporalType.DATE)
	@Column(name="delivery_schedule_appointment_date")
	@SerializedName("delivery_schedule_appointment_date")
	@JsonProperty("delivery_schedule_appointment_date")
	private Date deliveryScheduleAppointmentDate;

	private String shift;

	@Column(name = "payment_partner_code")
	@SerializedName("payment_partner_code")
	@JsonProperty("payment_partner_code")
	private String paymentPartnerCode;

	@Column(name = "payment_method")
	@SerializedName("payment_method")
	@JsonProperty("payment_method")
	private String paymentMethod;

	@Column(name = "transaction_id")
	@SerializedName("transaction_id")
	@JsonProperty("transaction_id")
	private String transactionId;

	@Column(name = "qr_code")
	@SerializedName("qr_code")
	@JsonProperty("qr_code")
	private String qrCode;

	public Parcel() {
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getActualCod() {
		return this.actualCod;
	}

	public void setActualCod(Double actualCod) {
		this.actualCod = actualCod;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Timestamp getCancelledAt() {
		return this.cancelledAt;
	}

	public void setCancelledAt(Timestamp cancelledAt) {
		this.cancelledAt = cancelledAt;
	}

	public Double getCod() {
		return this.cod;
	}

	public void setCod(Double cod) {
		this.cod = cod;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getConsigneeDetailAddress() {
		return this.consigneeDetailAddress;
	}

	public void setConsigneeDetailAddress(String consigneeDetailAddress) {
		this.consigneeDetailAddress = consigneeDetailAddress;
	}

	public String getConsigneePhone() {
		return this.consigneePhone;
	}

	public void setConsigneePhone(String consigneePhone) {
		this.consigneePhone = consigneePhone;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getCurrentWarehouseCode() {
		return this.currentWarehouseCode;
	}

	public void setCurrentWarehouseCode(String currentWarehouseCode) {
		this.currentWarehouseCode = currentWarehouseCode;
	}

	public Integer getCurrentWarehouseId() {
		return this.currentWarehouseId;
	}

	public void setCurrentWarehouseId(Integer currentWarehouseId) {
		this.currentWarehouseId = currentWarehouseId;
	}

	public Object getCustomFields() {
		return this.customFields;
	}

	public void setCustomFields(Object customFields) {
		this.customFields = customFields;
	}

	public Timestamp getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Timestamp getDeliveryDueDate() {
		return this.deliveryDueDate;
	}

	public void setDeliveryDueDate(Timestamp deliveryDueDate) {
		this.deliveryDueDate = deliveryDueDate;
	}

	public String getDeliveryLocationIdsPath() {
		return this.deliveryLocationIdsPath;
	}

	public void setDeliveryLocationIdsPath(String deliveryLocationIdsPath) {
		this.deliveryLocationIdsPath = deliveryLocationIdsPath;
	}

	public String getDeliveryLocationNamesPath() {
		return this.deliveryLocationNamesPath;
	}

	public void setDeliveryLocationNamesPath(String deliveryLocationNamesPath) {
		this.deliveryLocationNamesPath = deliveryLocationNamesPath;
	}

	public String getDeliveryNotes() {
		return this.deliveryNotes;
	}

	public void setDeliveryNotes(String deliveryNotes) {
		this.deliveryNotes = deliveryNotes;
	}

	public String getDeliveryShift() {
		return this.deliveryShift;
	}

	public void setDeliveryShift(String deliveryShift) {
		this.deliveryShift = deliveryShift;
	}

	public Integer getDeliveryTimes() {
		return this.deliveryTimes;
	}

	public void setDeliveryTimes(Integer deliveryTimes) {
		this.deliveryTimes = deliveryTimes;
	}

	public String getDeliveryWarehouseCode() {
		return this.deliveryWarehouseCode;
	}

	public void setDeliveryWarehouseCode(String deliveryWarehouseCode) {
		this.deliveryWarehouseCode = deliveryWarehouseCode;
	}

	public Integer getDeliveryWarehouseId() {
		return this.deliveryWarehouseId;
	}

	public void setDeliveryWarehouseId(Integer deliveryWarehouseId) {
		this.deliveryWarehouseId = deliveryWarehouseId;
	}

	public Timestamp getDoneAt() {
		return this.doneAt;
	}

	public void setDoneAt(Timestamp doneAt) {
		this.doneAt = doneAt;
	}

	public Timestamp getFailedAt() {
		return this.failedAt;
	}

	public void setFailedAt(Timestamp failedAt) {
		this.failedAt = failedAt;
	}

	public Object getFeatures() {
		return this.features;
	}

	public void setFeatures(Object features) {
		this.features = features;
	}

	public String getGoods() {
		return this.goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Timestamp getInProcessAt() {
		return this.inProcessAt;
	}

	public void setInProcessAt(Timestamp inProcessAt) {
		this.inProcessAt = inProcessAt;
	}

	public Timestamp getInternalFailedAt() {
		return this.internalFailedAt;
	}

	public void setInternalFailedAt(Timestamp internalFailedAt) {
		this.internalFailedAt = internalFailedAt;
	}

	public Boolean getIsReturn() {
		return this.isReturn;
	}

	public void setIsReturn(Boolean isReturn) {
		this.isReturn = isReturn;
	}

	public Timestamp getLastExportAt() {
		return this.lastExportAt;
	}

	public void setLastExportAt(Timestamp lastExportAt) {
		this.lastExportAt = lastExportAt;
	}

	public Timestamp getLastImportAt() {
		return this.lastImportAt;
	}

	public void setLastImportAt(Timestamp lastImportAt) {
		this.lastImportAt = lastImportAt;
	}

	public Timestamp getLastInventoryAt() {
		return this.lastInventoryAt;
	}

	public void setLastInventoryAt(Timestamp lastInventoryAt) {
		this.lastInventoryAt = lastInventoryAt;
	}

	public Integer getLenght() {
		return this.lenght;
	}

	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}

	public Integer getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantOrderCode() {
		return this.merchantOrderCode;
	}

	public void setMerchantOrderCode(String merchantOrderCode) {
		this.merchantOrderCode = merchantOrderCode;
	}

	public String getMerchantUsername() {
		return this.merchantUsername;
	}

	public void setMerchantUsername(String merchantUsername) {
		this.merchantUsername = merchantUsername;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderState() {
		return this.orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public Integer getPickupAddressId() {
		return this.pickupAddressId;
	}

	public void setPickupAddressId(Integer pickupAddressId) {
		this.pickupAddressId = pickupAddressId;
	}

	public String getPickupContact() {
		return this.pickupContact;
	}

	public void setPickupContact(String pickupContact) {
		this.pickupContact = pickupContact;
	}

	public Timestamp getPickupDate() {
		return this.pickupDate;
	}

	public void setPickupDate(Timestamp pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getPickupDetailAddress() {
		return this.pickupDetailAddress;
	}

	public void setPickupDetailAddress(String pickupDetailAddress) {
		this.pickupDetailAddress = pickupDetailAddress;
	}

	public Timestamp getPickupDueDate() {
		return this.pickupDueDate;
	}

	public void setPickupDueDate(Timestamp pickupDueDate) {
		this.pickupDueDate = pickupDueDate;
	}

	public String getPickupFullAddress() {
		return this.pickupFullAddress;
	}

	public void setPickupFullAddress(String pickupFullAddress) {
		this.pickupFullAddress = pickupFullAddress;
	}

	public String getPickupLocationIdsPath() {
		return this.pickupLocationIdsPath;
	}

	public void setPickupLocationIdsPath(String pickupLocationIdsPath) {
		this.pickupLocationIdsPath = pickupLocationIdsPath;
	}

	public String getPickupLocationNamesPath() {
		return this.pickupLocationNamesPath;
	}

	public void setPickupLocationNamesPath(String pickupLocationNamesPath) {
		this.pickupLocationNamesPath = pickupLocationNamesPath;
	}

	public String getPickupNotes() {
		return this.pickupNotes;
	}

	public void setPickupNotes(String pickupNotes) {
		this.pickupNotes = pickupNotes;
	}

	public String getPickupPhone() {
		return this.pickupPhone;
	}

	public void setPickupPhone(String pickupPhone) {
		this.pickupPhone = pickupPhone;
	}

	public Integer getPickupRequestId() {
		return this.pickupRequestId;
	}

	public void setPickupRequestId(Integer pickupRequestId) {
		this.pickupRequestId = pickupRequestId;
	}

	public String getPickupShift() {
		return this.pickupShift;
	}

	public void setPickupShift(String pickupShift) {
		this.pickupShift = pickupShift;
	}

	public Integer getPickupTimes() {
		return this.pickupTimes;
	}

	public void setPickupTimes(Integer pickupTimes) {
		this.pickupTimes = pickupTimes;
	}

	public String getPickupWarehouseCode() {
		return this.pickupWarehouseCode;
	}

	public void setPickupWarehouseCode(String pickupWarehouseCode) {
		this.pickupWarehouseCode = pickupWarehouseCode;
	}

	public Integer getPickupWarehouseId() {
		return this.pickupWarehouseId;
	}

	public void setPickupWarehouseId(Integer pickupWarehouseId) {
		this.pickupWarehouseId = pickupWarehouseId;
	}

	public double getReceiverPaymentAmount() {
		return this.receiverPaymentAmount;
	}

	public void setReceiverPaymentAmount(double receiverPaymentAmount) {
		this.receiverPaymentAmount = receiverPaymentAmount;
	}

	public Timestamp getRejectAt() {
		return this.rejectAt;
	}

	public void setRejectAt(Timestamp rejectAt) {
		this.rejectAt = rejectAt;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}

	public double getTotalMerchantFee() {
		return this.totalMerchantFee;
	}

	public void setTotalMerchantFee(double totalMerchantFee) {
		this.totalMerchantFee = totalMerchantFee;
	}

	public Object getTransitFailureNotes() {
		return transitFailureNotes;
	}

	public void setTransitFailureNotes(Object transitFailureNotes) {
		this.transitFailureNotes = transitFailureNotes;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getVolume() {
		return this.volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public String getWarehouseState() {
		return this.warehouseState;
	}

	public void setWarehouseState(String warehouseState) {
		this.warehouseState = warehouseState;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public String getConsigneeCode() {
		return consigneeCode;
	}

	public void setConsigneeCode(String consigneeCode) {
		this.consigneeCode = consigneeCode;
	}

	public String getConfirmedConsigneeCode() {
		return confirmedConsigneeCode;
	}

	public void setConfirmedConsigneeCode(String confirmedConsigneeCode) {
		this.confirmedConsigneeCode = confirmedConsigneeCode;
	}

	public String getDeliveryScheduleNotes() {
		return deliveryScheduleNotes;
	}

	public void setDeliveryScheduleNotes(String deliveryScheduleNotes) {
		this.deliveryScheduleNotes = deliveryScheduleNotes;
	}

	public Date getDeliveryScheduleAppointmentDate() {
		return deliveryScheduleAppointmentDate;
	}

	public void setDeliveryScheduleAppointmentDate(Date deliveryScheduleAppointmentDate) {
		this.deliveryScheduleAppointmentDate = deliveryScheduleAppointmentDate;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getPaymentPartnerCode() {
		return paymentPartnerCode;
	}

	public void setPaymentPartnerCode(String paymentPartnerCode) {
		this.paymentPartnerCode = paymentPartnerCode;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	@Override
	public String toString() {
		return "Parcel{" +
				"id=" + id +
				", actualCod=" + actualCod +
				", barcode='" + barcode + '\'' +
				", cancelledAt=" + cancelledAt +
				", cod=" + cod +
				", consignee='" + consignee + '\'' +
				", consigneeDetailAddress='" + consigneeDetailAddress + '\'' +
				", consigneePhone='" + consigneePhone + '\'' +
				", createdAt=" + createdAt +
				", currentWarehouseCode='" + currentWarehouseCode + '\'' +
				", currentWarehouseId=" + currentWarehouseId +
				", customFields=" + customFields +
				", deliveryDate=" + deliveryDate +
				", deliveryDueDate=" + deliveryDueDate +
				", deliveryLocationIdsPath='" + deliveryLocationIdsPath + '\'' +
				", deliveryLocationNamesPath='" + deliveryLocationNamesPath + '\'' +
				", deliveryNotes='" + deliveryNotes + '\'' +
				", deliveryShift='" + deliveryShift + '\'' +
				", deliveryTimes=" + deliveryTimes +
				", deliveryWarehouseCode='" + deliveryWarehouseCode + '\'' +
				", deliveryWarehouseId=" + deliveryWarehouseId +
				", doneAt=" + doneAt +
				", failedAt=" + failedAt +
				", features=" + features +
				", goods='" + goods + '\'' +
				", height=" + height +
				", inProcessAt=" + inProcessAt +
				", internalFailedAt=" + internalFailedAt +
				", isReturn=" + isReturn +
				", lastExportAt=" + lastExportAt +
				", lastImportAt=" + lastImportAt +
				", lastInventoryAt=" + lastInventoryAt +
				", lenght=" + lenght +
				", merchantId=" + merchantId +
				", merchantOrderCode='" + merchantOrderCode + '\'' +
				", merchantUsername='" + merchantUsername + '\'' +
				", orderCode='" + orderCode + '\'' +
				", orderId=" + orderId +
				", orderState='" + orderState + '\'' +
				", pickupAddressId=" + pickupAddressId +
				", pickupContact='" + pickupContact + '\'' +
				", pickupDate=" + pickupDate +
				", pickupDetailAddress='" + pickupDetailAddress + '\'' +
				", pickupDueDate=" + pickupDueDate +
				", pickupFullAddress='" + pickupFullAddress + '\'' +
				", pickupLocationIdsPath='" + pickupLocationIdsPath + '\'' +
				", pickupLocationNamesPath='" + pickupLocationNamesPath + '\'' +
				", pickupNotes='" + pickupNotes + '\'' +
				", pickupPhone='" + pickupPhone + '\'' +
				", pickupRequestId=" + pickupRequestId +
				", pickupShift='" + pickupShift + '\'' +
				", pickupTimes=" + pickupTimes +
				", pickupWarehouseCode='" + pickupWarehouseCode + '\'' +
				", pickupWarehouseId=" + pickupWarehouseId +
				", receiverPaymentAmount=" + receiverPaymentAmount +
				", rejectAt=" + rejectAt +
				", state='" + state + '\'' +
				", totalFee=" + totalFee +
				", totalMerchantFee=" + totalMerchantFee +
				", transitFailureNotes='" + transitFailureNotes + '\'' +
				", updatedAt=" + updatedAt +
				", userId=" + userId +
				", version=" + version +
				", volume=" + volume +
				", warehouseState='" + warehouseState + '\'' +
				", weight=" + weight +
				", width=" + width +
				", consigneeCode" + consigneeCode +
				", consigneeCode=" + consigneeCode +
//				", confirmedConsigneeCode=" + confirmedConsigneeCode +
				'}';
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}