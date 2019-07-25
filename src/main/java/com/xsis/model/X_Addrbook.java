package com.xsis.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="x_addrbook")
public class X_Addrbook {
	
	@Id
	@Column(name="id", nullable=false, length=11)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="created_by", nullable=false , length=11)
	private Long createdBy;
	
	@Column(name="created_on", nullable=false)
	private Timestamp createdOn;
	
	@Column(name="modified_by" , length=11)
	private Long modifiedBy;
	
	@Column(name="modified_on")
	private Timestamp modifiedOn;
	
	@Column(name="deleted_by" , length=11)
	private Long deletedBy;
	
	@Column(name="deleted_on")
	private Timestamp deletedOn;
	
	@Column(name="is_delete", nullable=false)
	private Boolean isDelete;
	
	@Column(name="is_locked", nullable=false)
	private Boolean isLocked;
	
	@Column(name="attempt", nullable=false, length=1)
	private Integer attempt;
	
	@Column(name="email", nullable=false, length=100)
	private String email;
	
	@Column(name="abuid", nullable=false, length=50)
	private String abuid;
	
	@Column(name="abpwd",nullable=false, length=50)
	private String abpwd;
	
	@Column(name="fp_token",length=100)
	private String fpToken;
	
	@Column(name="fp_expired_date")
	private Timestamp fpExpiredDate;
	
	@Column(name="fp_counter",nullable=false, length=3)
	private Integer fpCounter;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Long getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(Long deletedBy) {
		this.deletedBy = deletedBy;
	}

	public Timestamp getDeletedOn() {
		return deletedOn;
	}

	public void setDeletedOn(Timestamp deletedOn) {
		this.deletedOn = deletedOn;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Integer getAttempt() {
		return attempt;
	}

	public void setAttempt(Integer attempt) {
		this.attempt = attempt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbuid() {
		return abuid;
	}

	public void setAbuid(String abuid) {
		this.abuid = abuid;
	}

	public String getAbpwd() {
		return abpwd;
	}

	public void setAbpwd(String abpwd) {
		this.abpwd = abpwd;
	}

	public String getFpToken() {
		return fpToken;
	}

	public void setFpToken(String fpToken) {
		this.fpToken = fpToken;
	}

	public Timestamp getFpExpiredDate() {
		return fpExpiredDate;
	}

	public void setFpExpiredDate(Timestamp fpExpiredDate) {
		this.fpExpiredDate = fpExpiredDate;
	}

	public Integer getFpCounter() {
		return fpCounter;
	}

	public void setFpCounter(Integer fpCounter) {
		this.fpCounter = fpCounter;
	}
	
}
