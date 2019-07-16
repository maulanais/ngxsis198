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
@Table (name = "x_biodata")

public class BiodataModel {
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

	@Column(name = "is_deleted", nullable = false)
	private boolean is_deleted;
	
	@Column(name = "fullname", length=255)
	private String fullname;
	
	@Column(name = "nick_name", length=50)
	private String nick_name;
	
	@Column(name = "pob", length=100)
	private String pob;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "gender")
	private boolean gender;
	
	@Column(name = "religion_id")
	private Long religion_id;
	
	@Column(name = "high")
	private int high;
	
	@Column(name = "weight")
	private int weight;
	
	@Column(name = "nationality", length=100)
	private String nationality;
	
	@Column(name = "ethnic", length=50)
	private String ethnic;
	
	@Column(name = "hobby", length=255)
	private String hobby;
	
	@Column(name = "identity_type_id")
	private Long identity_type_id;
	
	@Column(name = "identity_no", length=50)
	private String identity_no;
	
	@Column(name = "email", length=100)
	private String email;
	
	@Column(name = "phone_number1", length=50)
	private String phone_number1;
	
	@Column(name = "phone_number2", length=50)
	private String phone_number2;
	
	@Column(name = "parent_phone_number", length=50)
	private String parent_phone_number;
	
	@Column(name = "child_sequence", length=5)
	private String child_sequence;
	
	@Column(name = "how_many_brothers", length=5)
	private String how_many_brothers;
	
	@Column(name = "marital_status_id")
	private Long marital_status_id;
	
	@Column(name = "addrbook_id")
	private Long addrbook_id;
	
	@Column(name = "token", length=10)
	private String token;
	
	@Column(name = "expired_token")
	private Date expired_token;
	
	@Column(name = "marriage_year", length=10)
	private String marriage_year;
	
	@Column(name = "company_id")
	private Long company_id;
	
	@Column(name = "is_process")
	private boolean is_process;
	
	@Column(name = "is_complete")
	private boolean is_complete;

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
		return is_deleted;
	}

	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Long getReligion_id() {
		return religion_id;
	}

	public void setReligion_id(Long religion_id) {
		this.religion_id = religion_id;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEthnic() {
		return ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Long getIdentity_type_id() {
		return identity_type_id;
	}

	public void setIdentity_type_id(Long identity_type_id) {
		this.identity_type_id = identity_type_id;
	}

	public String getIdentity_no() {
		return identity_no;
	}

	public void setIdentity_no(String identity_no) {
		this.identity_no = identity_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number1() {
		return phone_number1;
	}

	public void setPhone_number1(String phone_number1) {
		this.phone_number1 = phone_number1;
	}

	public String getPhone_number2() {
		return phone_number2;
	}

	public void setPhone_number2(String phone_number2) {
		this.phone_number2 = phone_number2;
	}

	public String getParent_phone_number() {
		return parent_phone_number;
	}

	public void setParent_phone_number(String parent_phone_number) {
		this.parent_phone_number = parent_phone_number;
	}

	public String getChild_sequence() {
		return child_sequence;
	}

	public void setChild_sequence(String child_sequence) {
		this.child_sequence = child_sequence;
	}

	public String getHow_many_brothers() {
		return how_many_brothers;
	}

	public void setHow_many_brothers(String how_many_brothers) {
		this.how_many_brothers = how_many_brothers;
	}

	public Long getMarital_status_id() {
		return marital_status_id;
	}

	public void setMarital_status_id(Long marital_status_id) {
		this.marital_status_id = marital_status_id;
	}

	public Long getAddrbook_id() {
		return addrbook_id;
	}

	public void setAddrbook_id(Long addrbook_id) {
		this.addrbook_id = addrbook_id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpired_token() {
		return expired_token;
	}

	public void setExpired_token(Date expired_token) {
		this.expired_token = expired_token;
	}

	public String getMarriage_year() {
		return marriage_year;
	}

	public void setMarriage_year(String marriage_year) {
		this.marriage_year = marriage_year;
	}

	public Long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}

	public boolean isIs_process() {
		return is_process;
	}

	public void setIs_process(boolean is_process) {
		this.is_process = is_process;
	}

	public boolean isIs_complete() {
		return is_complete;
	}

	public void setIs_complete(boolean is_complete) {
		this.is_complete = is_complete;
	}

}
