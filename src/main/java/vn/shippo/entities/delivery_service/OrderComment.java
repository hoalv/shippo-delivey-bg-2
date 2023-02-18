package vn.shippo.entities.delivery_service;

import com.avaje.ebean.annotation.DbJson;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the order_comments database table.
 * 
 */
@Entity
@Table(name="order_comments")
@NamedQuery(name="OrderComment.findAll", query="SELECT o FROM OrderComment o")
public class OrderComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="comment_object")
	@SerializedName("comment_object")
	@JsonProperty("comment_object")
	private String commentObject;

	@Column(name="comment_source")
	@SerializedName("comment_source")
	@JsonProperty("comment_source")
	private String commentSource;

	@SerializedName("content")
	@JsonProperty("content")
	@DbJson
	private Object content;

	private Integer created_user_id;

	public Integer getCreated_user_id() {
		return created_user_id;
	}

	public void setCreated_user_id(Integer created_user_id) {
		this.created_user_id = created_user_id;
	}
	@SerializedName("created_at")
	@Column(name="created_at")
	@JsonProperty("created_at")
	private Timestamp createdAt;

	@Column(name="order_id")
	@SerializedName("order_id")
	@JsonProperty("order_id")
	private Integer orderId;

	private String scope;

	@Column(name="updated_at")
	@SerializedName("updated_at")
	@JsonProperty("updated_at")
	private Timestamp updatedAt;

	private Integer version;

	public OrderComment() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommentObject() {
		return this.commentObject;
	}

	public void setCommentObject(String commentObject) {
		this.commentObject = commentObject;
	}

	public String getCommentSource() {
		return this.commentSource;
	}

	public void setCommentSource(String commentSource) {
		this.commentSource = commentSource;
	}

	public Object getContent() {
		return this.content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public String toString() {
		return "OrderComment{" +
				"id=" + id +
				", commentObject='" + commentObject + '\'' +
				", commentSource='" + commentSource + '\'' +
				", content='" + content + '\'' +
				", created_user_id=" + created_user_id +
				", createdAt=" + createdAt +
				", orderId=" + orderId +
				", scope='" + scope + '\'' +
				", updatedAt=" + updatedAt +
				", version=" + version +
				'}';
	}
}