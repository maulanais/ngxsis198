package com.xsis.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table (name="x_keahlian")
public class X_Keahlian {
	
	@Id
	@Column(name="id", nullable=false, length=11)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*
	 * @Column(name="create_by", nullable=false) private Long create_by;
	 * 
	 * @Column(name="create_on", nullable=false) private Timestamp create_on;
	 */
	
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
	
	@Column(name="biodata_id" , length=11)
	private Long biodataId;
	
	@Column(name="skill_name",length = 100)
	private String skillName;
	
	@Column(name="skill_level_id" , length=11)
	private Long skillLevelId;
	
	@ManyToOne
	@JoinColumn(name="skill_level_id", foreignKey=@ForeignKey(name="fk_keahlian_sklev_id"), insertable=false, updatable=false)
	private  X_Skill_Level skillLevel;
	
	@Column(name="notes", length= 1000)
	private String notes;

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

	public Long getBiodataId() {
		return biodataId;
	}

	public void setBiodataId(Long biodataId) {
		this.biodataId = biodataId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Long getSkillLevelId() {
		return skillLevelId;
	}

	public void setSkillLevelId(Long skillLevelId) {
		this.skillLevelId = skillLevelId;
	}

	public X_Skill_Level getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(X_Skill_Level skillLevel) {
		this.skillLevel = skillLevel;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}


	
}
