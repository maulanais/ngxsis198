package com.xsis.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="x_undangan_detail")
public class X_Undangan_Detail {

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
	
	@Column(name="undangan_id", nullable=false, length=11)
	private Long undanganId;
	


	@Column(name="biodata_id" , nullable=false, length=11)
	private Long biodataId;
	
	@ManyToOne
	@JoinColumn(name="biodata_id", foreignKey=@ForeignKey(name="fk_unddet_bio_id"), insertable=false, updatable=false)
	private  X_Biodata biodata;
	
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

	public Long getUndanganId() {
		return undanganId;
	}

	public void setUndanganId(Long undanganId) {
		this.undanganId = undanganId;
	}

	public Long getBiodataId() {
		return biodataId;
	}

	public void setBiodataId(Long biodataId) {
		this.biodataId = biodataId;
	}

	public X_Biodata getBiodata() {
		return biodata;
	}

	public void setBiodata(X_Biodata biodata) {
		this.biodata = biodata;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
