package com.xsis.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "x_addrbook")
public class HomeModel {
	@Id
	@Column(name="id", nullable = false)
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
	
	@Column(name = "is_locked", nullable = false)
	private boolean is_locked;
	
	@Column(name = "attempt", nullable = false)
	private int attempt;
	
	@Column(name = "email", nullable = false, length = 100)
	private String email;
	
	@Column(name = "abuid", nullable = false, length = 50)
	private String abuid;
	
	@Column(name = "abpwd", nullable = false, length = 50)
	private String abpwd;
	
	@Column(name = "fp_token", length = 100)
	private String fp_token;
	
	@Column(name = "fp_expired_date")
	private Timestamp fp_expired_date;
	
	@Column(name = "fp_counter")
	private int fp_counter;

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

	public boolean isIs_locked() {
		return is_locked;
	}

	public void setIs_locked(boolean is_locked) {
		this.is_locked = is_locked;
	}

	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
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

	public String getFp_token() {
		return fp_token;
	}

	public void setFp_token(String fp_token) {
		this.fp_token = fp_token;
	}

	public Timestamp getFp_expired_date() {
		return fp_expired_date;
	}

	public void setFp_expired_date(Timestamp fp_expired_date) {
		this.fp_expired_date = fp_expired_date;
	}

	public int getFp_counter() {
		return fp_counter;
	}

	public void setFp_counter(int fp_counter) {
		this.fp_counter = fp_counter;
	}

}
