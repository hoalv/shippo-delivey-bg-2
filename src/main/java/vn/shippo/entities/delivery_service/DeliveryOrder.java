package vn.shippo.entities.delivery_service;

import com.avaje.ebean.annotation.DbJson;
import com.avaje.ebean.annotation.DbJsonB;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the delivery_orders database table.
 * 
 */
@Entity
@Table(name="delivery_orders")
@NamedQuery(name="DeliveryOrder.findAll", query="SELECT d FROM DeliveryOrder d")
public class DeliveryOrder implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String barcode;

	private Double cod;

	@Column(name = "pickup_address_id")
	@SerializedName("pickup_address_id")
	@JsonProperty("pickup_address_id")
	private Integer pickupAddressId;

	@Column(name="create_from_order")
	@SerializedName("create_from_order")
	@JsonProperty("create_from_order")
	private Integer createFromOrder;

	@Column(name="create_method")
	@SerializedName("create_method")
	@JsonProperty("create_method")
	private String createMethod;

	@Column(name="created_at")
	@SerializedName("created_at")
	@JsonProperty("created_at")
	private Timestamp createdAt;

	@Column(name="current_warehouse_id")
	@SerializedName("current_warehouse_id")
	@JsonProperty("current_warehouse_id")
	private Integer currentWarehouseId;

	@Column(name="current_warehouse_state")
	@SerializedName("current_warehouse_state")
	@JsonProperty("current_warehouse_state")
	private String currentWarehouseState;

	@Column(name="receiver_name")
	@SerializedName("receiver_name")
	@JsonProperty("receiver_name")
	private String receiverName;

	@Column(name="deliver_detail_address")
	@SerializedName("deliver_detail_address")
	@JsonProperty("deliver_detail_address")
	private String deliverDetailAddress;

	@Column(name="deliver_full_address")
	@SerializedName("deliver_full_address")
	@JsonProperty("deliver_full_address")
	private String deliverFullAddress;

	@Column(name="deliver_location_ids_path")
	@SerializedName("deliver_location_ids_path")
	@JsonProperty("deliver_location_ids_path")
	private String deliverLocationIdsPath;

	@Column(name="deliver_location_names_path")
	@SerializedName("deliver_location_names_path")
	@JsonProperty("deliver_location_names_path")
	private String deliverLocationNamesPath;

	@Column(name="receiver_phone")
	@SerializedName("receiver_phone")
	@JsonProperty("receiver_phone")
	private String receiverPhone;

	@Column(name="deliver_times")
	@SerializedName("deliver_times")
	@JsonProperty("deliver_times")
	private Integer deliverTimes;

	@Column(name="deliver_warehouse_id")
	@SerializedName("deliver_warehouse_id")
	@JsonProperty("deliver_warehouse_id")
	private Integer deliverWarehouseId;

	@Column(name="delivery_note")
	@SerializedName("delivery_note")
	@JsonProperty("delivery_note")
	private String deliveryNote;

	@Column(name="export_warehouse_at")
	@SerializedName("export_warehouse_at")
	@JsonProperty("export_warehouse_at")
	private Timestamp exportWarehouseAt;

	@DbJsonB
	private Object features;

	private String goods;

	@Column(name="import_warehouse_at")
	@SerializedName("import_warehouse_at")
	@JsonProperty("import_warehouse_at")
	private Timestamp importWarehouseAt;

	@Column(name="is_return")
	@SerializedName("is_return")
	@JsonProperty("is_return")
	private Boolean isReturn;

	@Column(name="merchant_user_id")
	@SerializedName("merchant_user_id")
	@JsonProperty("merchant_user_id")
	private Integer merchantUserId;

	@Column(name="merchant_order_code")
	@SerializedName("merchant_order_code")
	@JsonProperty("merchant_order_code")
	private String merchantOrderCode;

	@Column(name="merchant_private_note")
	@SerializedName("merchant_private_note")
	@JsonProperty("merchant_private_note")
	private String merchantPrivateNote;

	@Column(name="order_state")
	@SerializedName("order_state")
	@JsonProperty("order_state")
	private String orderState;

	@Column(name="pickup_contact")
	@SerializedName("pickup_contact")
	@JsonProperty("pickup_contact")
	private String pickupContact;

	@Column(name="pickup_detail_address")
	@SerializedName("pickup_detail_address")
	@JsonProperty("pickup_detail_address")
	private String pickupDetailAddress;

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

	@Column(name="pickup_note")
	@SerializedName("pickup_note")
	@JsonProperty("pickup_note")
	private String pickupNote;

	@Column(name="pickup_phone")
	@SerializedName("pickup_phone")
	@JsonProperty("pickup_phone")
	private String pickupPhone;

	@Column(name="pickup_times")
	@SerializedName("pickup_times")
	@JsonProperty("pickup_times")
	private Integer pickupTimes;

	@Column(name="pickup_warehouse_id")
	@SerializedName("pickup_warehouse_id")
	@JsonProperty("pickup_warehouse_id")
	private Integer pickupWarehouseId;

	@Column(name="real_cod")
	@SerializedName("real_cod")
	@JsonProperty("real_cod")
	private Double realCod;

	private String state;

	@DbJsonB
	private Object timeline;

	@Column(name="total_fee")
	@SerializedName("total_fee")
	@JsonProperty("total_fee")
	private Double totalFee;

	@Column(name="total_merchant_fee")
	@SerializedName("total_merchant_fee")
	@JsonProperty("total_merchant_fee")
	private Double totalMerchantFee;

	@DbJsonB
	private Object metadata;

	@Column(name="updated_at")
	@SerializedName("updated_at")
	@JsonProperty("updated_at")
	private Timestamp updatedAt;

	private Integer version;

	private Integer weight;

	@Column(name="prepare_pickup_at")
	@SerializedName("prepare_pickup_at")
	@JsonProperty("prepare_pickup_at")
	private Timestamp preparePickupAt;

	@Column(name="picked_up_at")
	@SerializedName("picked_up_at")
	@JsonProperty("picked_up_at")
	private Timestamp pickedUpAt;

	@Column(name="prepare_delivery_at")
	@SerializedName("prepare_delivery_at")
	@JsonProperty("prepare_delivery_at")
	private Timestamp prepareDeliveryAt;

	@Column(name="start_delivery_at")
	@SerializedName("start_delivery_at")
	@JsonProperty("start_delivery_at")
	private Timestamp startDeliveryAt;

	@Column(name="prepare_redelivery_at")
	@SerializedName("prepare_redelivery_at")
	@JsonProperty("prepare_redelivery_at")
	private Timestamp prepareRedeliveryAt;

	@Column(name="failed_delivery_at")
	@SerializedName("failed_delivery_at")
	@JsonProperty("failed_delivery_at")
	private Timestamp failedDeliveryAt;

	@Column(name="delivered_at")
	@SerializedName("delivered_at")
	@JsonProperty("delivered_at")
	private Timestamp deliveredAt;

	@Column(name="delivery_completed_at")
	@SerializedName("delivery_completed_at")
	@JsonProperty("delivery_completed_at")
	private Timestamp deliveryCompletedAt;

	@Column(name="prepare_return_at")
	@SerializedName("prepare_return_at")
	@JsonProperty("prepare_return_at")
	private Timestamp prepareReturnAt;

	@Column(name="start_return_at")
	@SerializedName("start_return_at")
	@JsonProperty("start_return_at")
	private Timestamp startReturnAt;

	@Column(name="returned_at")
	@SerializedName("returned_at")
	@JsonProperty("returned_at")
	private Timestamp returnedAt;

	@Column(name="cancelled_at")
	@SerializedName("cancelled_at")
	@JsonProperty("cancelled_at")
	private Timestamp cancelledAt;

	@Column(name="returned_completed_at")
	@SerializedName("returned_completed_at")
	@JsonProperty("returned_completed_at")
	private Timestamp returnedCompletedAt;

	@Column(name="delivery_to_hub_at")
	@SerializedName("delivery_to_hub_at")
	@JsonProperty("delivery_to_hub_at")
	private Timestamp deliveryToHubAt;

	@Column(name="delivery_schedule_notes")
	@SerializedName("delivery_schedule_notes")
	@JsonProperty("delivery_schedule_notes")
	private String deliveryScheduleNotes;

	@Column(name="delivery_schedule_shift_code")
	@SerializedName("delivery_schedule_shift_code")
	@JsonProperty("delivery_schedule_shift_code")
	private String deliveryScheduleShiftCode;

	@Temporal(TemporalType.DATE)
	@Column(name="delivery_schedule_appointment_date")
	@SerializedName("delivery_schedule_appointment_date")
	@JsonProperty("delivery_schedule_appointment_date")
	private Date deliveryScheduleAppointmentDate;

	private String shift;

	@Column(name="delivery_package")
	@SerializedName("delivery_package")
	@JsonProperty("delivery_package")
	private String deliveryPackage;

	@DbJson
	private Object services;

	@DbJson
	@Column(name="transit_failure_notes")
	@SerializedName("transit_failure_notes")
	@JsonProperty("transit_failure_notes")
	private Object transitFailureNotes;

	@Column(name="consignee_code")
	@SerializedName("consignee_code")
	@JsonProperty("consignee_code")
	private String consigneeCode;

	@Column(name="confirmed_consignee_code")
	@SerializedName("confirmed_consignee_code")
	@JsonProperty("confirmed_consignee_code")
	private String confirmedConsigneeCode;

    @Column(name="merchant_id")
    @SerializedName("merchant_id")
    @JsonProperty("merchant_id")
    private Integer merchantId;

    @Column(name="merchant_username")
    @SerializedName("merchant_username")
    @JsonProperty("merchant_username")
    private String merchantUsername;

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

	public DeliveryOrder() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Double getCod() {
		return this.cod;
	}

	public void setCod(Double cod) {
		this.cod = cod;
	}

	public Integer getCreateFromOrder() {
		return this.createFromOrder;
	}

	public void setCreateFromOrder(Integer createFromOrder) {
		this.createFromOrder = createFromOrder;
	}

	public String getCreateMethod() {
		return this.createMethod;
	}

	public void setCreateMethod(String createMethod) {
		this.createMethod = createMethod;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getCurrentWarehouseId() {
		return this.currentWarehouseId;
	}

	public void setCurrentWarehouseId(Integer currentWarehouseId) {
		this.currentWarehouseId = currentWarehouseId;
	}

	public String getCurrentWarehouseState() {
		return this.currentWarehouseState;
	}

	public void setCurrentWarehouseState(String currentWarehouseState) {
		this.currentWarehouseState = currentWarehouseState;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

    public String getDeliverDetailAddress() {
		return this.deliverDetailAddress;
	}

	public void setDeliverDetailAddress(String deliverDetailAddress) {
		this.deliverDetailAddress = deliverDetailAddress;
	}

	public String getDeliverFullAddress() {
		return this.deliverFullAddress;
	}

	public void setDeliverFullAddress(String deliverFullAddress) {
		this.deliverFullAddress = deliverFullAddress;
	}

	public String getDeliverLocationIdsPath() {
		return this.deliverLocationIdsPath;
	}

	public void setDeliverLocationIdsPath(String deliverLocationIdsPath) {
		this.deliverLocationIdsPath = deliverLocationIdsPath;
	}

	public String getDeliverLocationNamesPath() {
		return this.deliverLocationNamesPath;
	}

	public void setDeliverLocationNamesPath(String deliverLocationNamesPath) {
		this.deliverLocationNamesPath = deliverLocationNamesPath;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public Integer getDeliverTimes() {
		return this.deliverTimes;
	}

	public void setDeliverTimes(Integer deliverTimes) {
		this.deliverTimes = deliverTimes;
	}

	public Integer getDeliverWarehouseId() {
		return this.deliverWarehouseId;
	}

	public void setDeliverWarehouseId(Integer deliverWarehouseId) {
		this.deliverWarehouseId = deliverWarehouseId;
	}

	public String getDeliveryNote() {
		return this.deliveryNote;
	}

	public void setDeliveryNote(String deliveryNote) {
		this.deliveryNote = deliveryNote;
	}

	public Timestamp getExportWarehouseAt() {
		return this.exportWarehouseAt;
	}

	public void setExportWarehouseAt(Timestamp exportWarehouseAt) {
		this.exportWarehouseAt = exportWarehouseAt;
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

	public Timestamp getImportWarehouseAt() {
		return this.importWarehouseAt;
	}

	public void setImportWarehouseAt(Timestamp importWarehouseAt) {
		this.importWarehouseAt = importWarehouseAt;
	}

	public Boolean getIsReturn() {
		return this.isReturn;
	}

	public void setIsReturn(Boolean isReturn) {
		this.isReturn = isReturn;
	}

	public Integer getMerchantUserId() {
		return merchantUserId;
	}

	public void setMerchantUserId(Integer merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getMerchantOrderCode() {
		return this.merchantOrderCode;
	}

	public void setMerchantOrderCode(String merchantOrderCode) {
		this.merchantOrderCode = merchantOrderCode;
	}

	public String getMerchantPrivateNote() {
		return this.merchantPrivateNote;
	}

	public void setMerchantPrivateNote(String merchantPrivateNote) {
		this.merchantPrivateNote = merchantPrivateNote;
	}

	public String getOrderState() {
		return this.orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getPickupContact() {
		return this.pickupContact;
	}

	public void setPickupContact(String pickupContact) {
		this.pickupContact = pickupContact;
	}

	public String getPickupDetailAddress() {
		return this.pickupDetailAddress;
	}

	public void setPickupDetailAddress(String pickupDetailAddress) {
		this.pickupDetailAddress = pickupDetailAddress;
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

	public String getPickupNote() {
		return this.pickupNote;
	}

	public void setPickupNote(String pickupNote) {
		this.pickupNote = pickupNote;
	}

	public String getPickupPhone() {
		return this.pickupPhone;
	}

	public void setPickupPhone(String pickupPhone) {
		this.pickupPhone = pickupPhone;
	}

	public Integer getPickupTimes() {
		return this.pickupTimes;
	}

	public void setPickupTimes(Integer pickupTimes) {
		this.pickupTimes = pickupTimes;
	}

	public Integer getPickupWarehouseId() {
		return this.pickupWarehouseId;
	}

	public void setPickupWarehouseId(Integer pickupWarehouseId) {
		this.pickupWarehouseId = pickupWarehouseId;
	}

	public Double getRealCod() {
		return this.realCod;
	}

	public void setRealCod(Double realCod) {
		this.realCod = realCod;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Object getTimeline() {
		return this.timeline;
	}

	public void setTimeline(Object timeline) {
		this.timeline = timeline;
	}

	public Double getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}

	public Double getTotalMerchantFee() {
		return this.totalMerchantFee;
	}

	public void setTotalMerchantFee(Double totalMerchantFee) {
		this.totalMerchantFee = totalMerchantFee;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getPickupAddressId() {
		return pickupAddressId;
	}

	public void setPickupAddressId(Integer pickupAddressId) {
		this.pickupAddressId = pickupAddressId;
	}

	public Boolean getReturn() {
		return isReturn;
	}

	public void setReturn(Boolean aReturn) {
		isReturn = aReturn;
	}

	public Object getMetadata() {
		return metadata;
	}

	public void setMetadata(Object metadata) {
		this.metadata = metadata;
	}

	public Timestamp getPreparePickupAt() {
		return preparePickupAt;
	}

	public void setPreparePickupAt(Timestamp preparePickupAt) {
		this.preparePickupAt = preparePickupAt;
	}

	public Timestamp getPickedUpAt() {
		return pickedUpAt;
	}

	public void setPickedUpAt(Timestamp pickedUpAt) {
		this.pickedUpAt = pickedUpAt;
	}

	public Timestamp getPrepareDeliveryAt() {
		return prepareDeliveryAt;
	}

	public void setPrepareDeliveryAt(Timestamp prepareDeliveryAt) {
		this.prepareDeliveryAt = prepareDeliveryAt;
	}

	public Timestamp getStartDeliveryAt() {
		return startDeliveryAt;
	}

	public void setStartDeliveryAt(Timestamp startDeliveryAt) {
		this.startDeliveryAt = startDeliveryAt;
	}

	public Timestamp getPrepareRedeliveryAt() {
		return prepareRedeliveryAt;
	}

	public void setPrepareRedeliveryAt(Timestamp prepareRedeliveryAt) {
		this.prepareRedeliveryAt = prepareRedeliveryAt;
	}

	public Timestamp getFailedDeliveryAt() {
		return failedDeliveryAt;
	}

	public void setFailedDeliveryAt(Timestamp failedDeliveryAt) {
		this.failedDeliveryAt = failedDeliveryAt;
	}

	public Timestamp getDeliveredAt() {
		return deliveredAt;
	}

	public void setDeliveredAt(Timestamp deliveredAt) {
		this.deliveredAt = deliveredAt;
	}

	public Timestamp getDeliveryCompletedAt() {
		return deliveryCompletedAt;
	}

	public void setDeliveryCompletedAt(Timestamp deliveryCompletedAt) {
		this.deliveryCompletedAt = deliveryCompletedAt;
	}

	public Timestamp getPrepareReturnAt() {
		return prepareReturnAt;
	}

	public void setPrepareReturnAt(Timestamp prepareReturnAt) {
		this.prepareReturnAt = prepareReturnAt;
	}

	public Timestamp getStartReturnAt() {
		return startReturnAt;
	}

	public void setStartReturnAt(Timestamp startReturnAt) {
		this.startReturnAt = startReturnAt;
	}

	public Timestamp getReturnedAt() {
		return returnedAt;
	}

	public void setReturnedAt(Timestamp returnedAt) {
		this.returnedAt = returnedAt;
	}

	public Timestamp getCancelledAt() {
		return cancelledAt;
	}

	public void setCancelledAt(Timestamp cancelledAt) {
		this.cancelledAt = cancelledAt;
	}

	public Timestamp getReturnedCompletedAt() {
		return returnedCompletedAt;
	}

	public void setReturnedCompletedAt(Timestamp returnedCompletedAt) {
		this.returnedCompletedAt = returnedCompletedAt;
	}

	public Timestamp getDeliveryToHubAt() {
		return deliveryToHubAt;
	}

	public void setDeliveryToHubAt(Timestamp deliveryToHubAt) {
		this.deliveryToHubAt = deliveryToHubAt;
	}

	public String getDeliveryScheduleNotes() {
		return deliveryScheduleNotes;
	}

	public void setDeliveryScheduleNotes(String deliveryScheduleNotes) {
		this.deliveryScheduleNotes = deliveryScheduleNotes;
	}

	public String getDeliveryScheduleShiftCode() {
		return deliveryScheduleShiftCode;
	}

	public void setDeliveryScheduleShiftCode(String deliveryScheduleShiftCode) {
		this.deliveryScheduleShiftCode = deliveryScheduleShiftCode;
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

	public String getDeliveryPackage() {
		return deliveryPackage;
	}

	public void setDeliveryPackage(String deliveryPackage) {
		this.deliveryPackage = deliveryPackage;
	}

	public Object getServices() {
		return services;
	}

	public void setServices(Object services) {
		this.services = services;
	}

	public Object getTransitFailureNotes() {
		return transitFailureNotes;
	}

	public void setTransitFailureNotes(Object transitFailureNotes) {
		this.transitFailureNotes = transitFailureNotes;
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

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantUsername() {
        return merchantUsername;
    }

    public void setMerchantUsername(String merchantUsername) {
        this.merchantUsername = merchantUsername;
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
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public String toString() {
		return "DeliveryOrder{" +
				"id=" + id +
				", barcode='" + barcode + '\'' +
				", cod=" + cod +
				", pickupAddressId=" + pickupAddressId +
				", createFromOrder=" + createFromOrder +
				", createMethod='" + createMethod + '\'' +
				", createdAt=" + createdAt +
				", currentWarehouseId=" + currentWarehouseId +
				", currentWarehouseState='" + currentWarehouseState + '\'' +
				", receiverName='" + receiverName + '\'' +
				", deliverDetailAddress='" + deliverDetailAddress + '\'' +
				", deliverFullAddress='" + deliverFullAddress + '\'' +
				", deliverLocationIdsPath='" + deliverLocationIdsPath + '\'' +
				", deliverLocationNamesPath='" + deliverLocationNamesPath + '\'' +
				", receiverPhone='" + receiverPhone + '\'' +
				", deliverTimes=" + deliverTimes +
				", deliverWarehouseId=" + deliverWarehouseId +
				", deliveryNote='" + deliveryNote + '\'' +
				", exportWarehouseAt=" + exportWarehouseAt +
				", features=" + features +
				", goods=" + goods +
				", importWarehouseAt=" + importWarehouseAt +
				", isReturn=" + isReturn +
				", merchantUserId=" + merchantUserId +
				", merchantOrderCode='" + merchantOrderCode + '\'' +
				", merchantPrivateNote='" + merchantPrivateNote + '\'' +
				", orderState='" + orderState + '\'' +
				", pickupContact='" + pickupContact + '\'' +
				", pickupDetailAddress='" + pickupDetailAddress + '\'' +
				", pickupFullAddress='" + pickupFullAddress + '\'' +
				", pickupLocationIdsPath='" + pickupLocationIdsPath + '\'' +
				", pickupLocationNamesPath='" + pickupLocationNamesPath + '\'' +
				", pickupNote='" + pickupNote + '\'' +
				", pickupPhone='" + pickupPhone + '\'' +
				", pickupTimes=" + pickupTimes +
				", pickupWarehouseId=" + pickupWarehouseId +
				", realCod=" + realCod +
				", state='" + state + '\'' +
				", timeline=" + timeline +
				", totalFee=" + totalFee +
				", totalMerchantFee=" + totalMerchantFee +
				", metadata=" + metadata +
				", updatedAt=" + updatedAt +
				", version=" + version +
				", weight=" + weight +
				", consigneeCode=" + consigneeCode +
//				", confirmedConsigneeCode=" + confirmedConsigneeCode +
				'}';
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

    public void increaseVersion() {
		if (version % 2 == 0) {
			version += 2;
		} else {
			version += 1;
		}
    }

    public class State {
		public static final String WAITING_FOR_PICKUP = "WAITING_FOR_PICKUP";
		public static final String WAITING_FOR_DELIVER = "WAITING_FOR_DELIVER";
		public static final String PICKING_UP = "PICKING_UP";
		public static final String PICKED_UP = "PICKED_UP";
		public static final String IN_TRANSFER = "IN_TRANSFER";
		public static final String DELIVERING = "DELIVERING";
		public static final String DELIVERED = "DELIVERED";
	}

	public class CustomerState {

		public static final String CUSTOMER_DELIVERED = "CUSTOMER_DELIVERED";
		public static final String CUSTOMER_WAITING_REDELIVERING = "CUSTOMER_WAITING_REDELIVERING";
		public static final String CUSTOMER_REDELIVERING = "CUSTOMER_REDELIVERING";
		public static final String CUSTOMER_RETURNED = "CUSTOMER_RETURNED";
		public static final String CUSTOMER_PICKING_UP = "CUSTOMER_PICKING_UP";
	}
}

