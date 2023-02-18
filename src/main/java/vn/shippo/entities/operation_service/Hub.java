package vn.shippo.entities.operation_service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the hubs database table.
 * 
 */
@Entity
@Table(name="hubs")
@NamedQuery(name="Hub.findAll", query="SELECT h FROM Hub h")
public class Hub implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String address;

	private String code;

	@Column(name="district_id")
	@SerializedName("district_id")
	@JsonProperty("district_id")
	private Integer districtId;

	@Column(name="is_deleted")
	@SerializedName("is_deleted")
	@JsonProperty("is_deleted")
	private Boolean isDeleted;

	private String name;

	@Column(name="phone_number")
	@SerializedName("phone_number")
	@JsonProperty("phone_number")
	private String phoneNumber;

	@Column(name="province_id")
	@SerializedName("province_id")
	@JsonProperty("province_id")
	private Integer provinceId;


	public Hub() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}


}