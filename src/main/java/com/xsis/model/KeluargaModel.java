package com.xsis.model;



import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "x_keluarga")
public class KeluargaModel {

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
	
	@Column(name = "family_tree_type_id")
	private Long family_tree_type_id;

	@Column(name = "family_relation_id")
	private Long family_relation_id;

	@Column(name = "name", length = 100)
	private String name;

	@Column(name = "gender")
	private boolean gender;

	@Column(name = "dob", length = 10)
	private Date dob;
	
	@Column(name = "education_level_id")
	private Long education_level_id;
	
	@Column(name = "job", length = 100)
	private String job;
	
	@Column(name = "notes", length = 1000)
	private String notes;

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

	public Long getFamily_tree_type_id() {
		return family_tree_type_id;
	}

	public void setFamily_tree_type_id(Long family_tree_type_id) {
		this.family_tree_type_id = family_tree_type_id;
	}

	public Long getFamily_relation_id() {
		return family_relation_id;
	}

	public void setFamily_relation_id(Long family_relation_id) {
		this.family_relation_id = family_relation_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getEducation_level_id() {
		return education_level_id;
	}

	public void setEducation_level_id(Long education_level_id) {
		this.education_level_id = education_level_id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
		
}
	

