package vn.shippo.entities.delivery_service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "receiver_information")
@NamedQuery(name = "ReceiverInformation.findAll",query = "Select r from ReceiverInformation r")
public class ReceiverInformation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @SerializedName("name")
    @JsonProperty("name")
    private String name;

    @Column(name = "phone_number")
    @SerializedName("phone_number")
    @JsonProperty("phone_number")
    private String phoneNumber;

    @Column(name = "address")
    @SerializedName("address")
    @JsonProperty("address")
    private String address;

    @Column(name = "location_ids_path")
    @SerializedName("location_ids_path")
    @JsonProperty("location_ids_path")
    private String locationIdPath;

    @Column(name = "location_names_path")
    @SerializedName("location_names_path")
    @JsonProperty("location_names_path")
    private String locationNamePath;

    @Column(name = "created_at")
    @SerializedName("created_at")
    @JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @SerializedName("updated_at")
    @JsonProperty("updated_at")
    private Timestamp updatedAt;

    public ReceiverInformation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocationIdPath() {
        return locationIdPath;
    }

    public void setLocationIdPath(String locationIdPath) {
        this.locationIdPath = locationIdPath;
    }

    public String getLocationNamePath() {
        return locationNamePath;
    }

    public void setLocationNamePath(String locationNamePath) {
        this.locationNamePath = locationNamePath;
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
        return "ReceiverInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", locationIdPath='" + locationIdPath + '\'' +
                ", locationNamePath='" + locationNamePath + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
