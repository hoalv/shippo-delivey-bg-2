package vn.shippo.entities.delivery_service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "receiver_mapping_merchants")
@NamedQuery(name = "ReceiverMappingMerchant.findAll", query = "Select rm from ReceiverMappingMerchant rm")
public class ReceiverMappingMerchant implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @SerializedName("id")
    @JsonProperty("id")
    private Integer id;

    @Column(name = "receiver_phone")
    @SerializedName("receiver_phone")
    @JsonProperty("receiver_phone")
    private String receiverPhone;

    @Column(name = "merchant_id")
    @SerializedName("merchant_id")
    @JsonProperty("merchant_id")
    private Integer merchantId;

    @Column(name = "created_at")
    @SerializedName("created_at")
    @JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @SerializedName("updated_at")
    @JsonProperty("updated_at")
    private Timestamp updatedAt;

    public ReceiverMappingMerchant() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ReceiverMappingMerchant{" +
                "id=" + id +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", merchantId=" + merchantId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
