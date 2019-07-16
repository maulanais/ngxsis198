package com.xsis.model;



import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "x_riwayat_pendidikan")
public class PendidikanModel {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "created_by", nullable = false)
	private Long created_by;
	
	@Column(name="created_on", nullable=false)
	private Timestamp created_on;
	
	@Column(name = "modified_by")
	private Long modified_by;
	
	@Column(name = "modified_on")
	private Timestamp modified_on;

	@Column(name = "deleted_by")
	private Long deleted_by;
	
	@Column(name = "deleted_on")
	private Timestamp deleted_on;

	@Column(name = "is_delete", nullable = false)
	private boolean is_delete;
	
	@Column(name = "biodata_id", nullable = false)
	private Long biodata_id;
	
	@Column(name = "school_name", length = 100)
	private String school_name;

	@Column(name = "city", length = 50)
	private String city;

	@Column(name = "country", length = 50)
	private String country;

	@Column(name = "education_level_id")
	private int education_level_id;

	@Column(name = "entry_year", length = 10)
	private String entry_year;
	
	@Column(name = "graduation_year", length = 10)
	private String graduation_year;
	
	@Column(name = "major", length = 100)
	private String major;
	
	@Column(name = "gpa")
	private int gpa;
	
	@Column(name = "notes", length = 1000)
	private String notes;
	
	@Column(name = "judul_ta", length = 255)
	private String judul_ta;
	
	@Column(name = "deskripsi_ta", length = 5000)
	private String deskripsi_ta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Long created_by) {
		this.created_by = created_by;
	}

	public Timestamp getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}

	public Long getModified_by() {
		return modified_by;
	}

	public void setModified_by(Long modified_by) {
		this.modified_by = modified_by;
	}

	public Timestamp getModified_on() {
		return modified_on;
	}

	public void setModified_on(Timestamp modified_on) {
		this.modified_on = modified_on;
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

	public boolean isIs_delete() {
		return is_delete;
	}

	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}

	public Long getBiodata_id() {
		return biodata_id;
	}

	public void setBiodata_id(Long biodata_id) {
		this.biodata_id = biodata_id;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getEducation_level_id() {
		return education_level_id;
	}

	public void setEducation_level_id(int education_level_id) {
		this.education_level_id = education_level_id;
	}

	public String getEntry_year() {
		return entry_year;
	}

	public void setEntry_year(String entry_year) {
		this.entry_year = entry_year;
	}

	public String getGraduation_year() {
		return graduation_year;
	}

	public void setGraduation_year(String graduation_year) {
		this.graduation_year = graduation_year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getJudul_ta() {
		return judul_ta;
	}

	public void setJudul_ta(String judul_ta) {
		this.judul_ta = judul_ta;
	}

	public String getDeskripsi_ta() {
		return deskripsi_ta;
	}

	public void setDeskripsi_ta(String deskripsi_ta) {
		this.deskripsi_ta = deskripsi_ta;
	}

	
	
}
	

