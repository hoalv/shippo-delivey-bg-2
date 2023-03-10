package vn.shippo.entities.delivery_service;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the locations database table.
 * 
 */
@Entity
@Table(name="locations")
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String code;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="created_by")
	private Integer createdBy;

	@Column(name="is_deleted")
	private Boolean isDeleted;

	private Integer level;

	private String lineage;

	@Column(name="updated_by")
	private Integer updatedBy;

	private String name;

	@Column(name="parent_id")
	private Integer parentId;

	@Column(name="postal_code")
	private String postalCode;

	private Integer priority;

	private String state;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	public Location() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getLineage() {
		return this.lineage;
	}

	public void setLineage(String lineage) {
		this.lineage = lineage;
	}

	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public String toString() {
		return "Location{" +
				"id=" + id +
				", code='" + code + '\'' +
				", createdAt=" + createdAt +
				", createdBy=" + createdBy +
				", isDeleted=" + isDeleted +
				", level=" + level +
				", lineage='" + lineage + '\'' +
				", updatedBy=" + updatedBy +
				", name='" + name + '\'' +
				", parentId=" + parentId +
				", postalCode='" + postalCode + '\'' +
				", priority=" + priority +
				", state='" + state + '\'' +
				", updatedAt=" + updatedAt +
				'}';
	}
}