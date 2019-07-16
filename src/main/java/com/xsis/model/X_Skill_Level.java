package com.xsis.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="x_skill_level")
public class X_Skill_Level {

	
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
	
	@Column(name="is_delete" , nullable=false)
	private Boolean isDelete;
	
	@Column(name="name" , nullable=false ,length = 50)
	private String name;
	
	@Column(name="description", length= 100)
	private String description;

	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
