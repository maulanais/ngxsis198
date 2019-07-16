package com.xsis.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="x_sertifikasi")
public class SertifikasiModel {
	
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="create_by",nullable=false)
	private Long create_by;
	
	@Column(name="create_on",nullable=false)
	private Timestamp create_on;
	
	@Column(name="modified_by")
	private Long modified_by;
	
	@Column(name="deleted_by")
	private Long deleted_by;
	
	@Column(name="deleted_on")
	private Timestamp deleted_on;
	
	@Column(name="is_delete",nullable=false)
	private Boolean is_delete;
	
	@Column(name="biodata_id",nullable=false)
	private Long biodata_id;
	
	@Column(name="certificate_name", length = 200)
	private String certificate_name;
	
	@Column(name="publisher", length = 100)
	private String publisher;
	
	@Column(name="valid_start_year", length = 10)
	private String valid_start_year;
	
	@Column(name="valid_start_month", length = 10)
	private String valid_start_month;
	
	@Column(name="until_year", length = 10)
	private String until_year;
	
	@Column(name="until_month", length = 10)
	private String until_month;
	
	@Column(name="notes", length = 1000)
	private String notes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreate_by() {
		return create_by;
	}

	public void setCreate_by(Long create_by) {
		this.create_by = create_by;
	}

	public Timestamp getCreate_on() {
		return create_on;
	}

	public void setCreate_on(Timestamp create_on) {
		this.create_on = create_on;
	}

	public Long getModified_by() {
		return modified_by;
	}

	public void setModified_by(Long modified_by) {
		this.modified_by = modified_by;
	}

	public Long getDeleted_by() {
		return deleted_by;
	}

	public void setDeleted_by(Long deleted_by) {
		this.deleted_by = deleted_by;
	}

	public Timestamp getDeleted_on() {
		return deleted_on;
	}

	public void setDeleted_on(Timestamp deleted_on) {
		this.deleted_on = deleted_on;
	}

	public Boolean getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Boolean is_delete) {
		this.is_delete = is_delete;
	}

	public Long getBiodata_id() {
		return biodata_id;
	}

	public void setBiodata_id(Long biodata_id) {
		this.biodata_id = biodata_id;
	}

	public String getCertificate_name() {
		return certificate_name;
	}

	public void setCertificate_name(String certificate_name) {
		this.certificate_name = certificate_name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getValid_start_year() {
		return valid_start_year;
	}

	public void setValid_start_year(String valid_start_year) {
		this.valid_start_year = valid_start_year;
	}

	public String getValid_start_month() {
		return valid_start_month;
	}

	public void setValid_start_month(String valid_start_month) {
		this.valid_start_month = valid_start_month;
	}

	public String getUntil_year() {
		return until_year;
	}

	public void setUntil_year(String until_year) {
		this.until_year = until_year;
	}

	public String getUntil_month() {
		return until_month;
	}

	public void setUntil_month(String until_month) {
		this.until_month = until_month;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
