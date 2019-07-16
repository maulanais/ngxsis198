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
@Table(name="x_biodata")
public class X_Biodata {

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
	
	@Column(name="fullname", length=225, nullable=false)
	private String fullname;
	
	@Column(name="nick_name", length=100, nullable=false)
	private String nickname;
	
	@Column(name="pob", length=100, nullable=false)
	private String pob;
	
	@Column(name="dob", nullable=false)
	private Date dob;
	
	@Column(name="gender", nullable=false)
	private Boolean gender;
	
	@Column(name="religion_id", length=11, nullable=false)
	private Long religionId;
	
	@Column(name="high")
	private Integer high;

	@Column(name="weight")
	private Integer weight;

	@Column(name="nationality", length=100)
	private String nationality;
	
	@Column(name="ethnic", length=50)
	private String ethnic;
	
	@Column(name="hobby", length=225)
	private String hobby;
	
	@Column(name="identity_type_id", length=11, nullable=false)
	private Long identityTypeId;
	
	@Column(name="identity_no", length=50, nullable=false)
	private String identityNo;
	
	@Column(name="email", length=100, nullable=false)
	private String email;

	@Column(name="phone_number1", length=50, nullable=false)
	private String phoneNumber1;
	
	@Column(name="phone_number2", length=50)
	private String phoneNumber2;
	
	@Column(name="parent_phone_number", length=50, nullable=false)
	private String parentPhoneNumber;

	@Column(name="child_sequence", length=5)
	private String childSequence;
	
	@Column(name="how_many_brothers", length=5)
	private String howManyBrothers;
	
	@Column(name="marital_status_id", length=11, nullable=false)
	private Long maritalStatusId;
	
	@Column(name="addrbook_id", length=11)
	private Long addrbookId;
	
	@Column(name="token", length=10)
	private String token;

	@Column(name="expired_token")
	private Date expiredToken;
	
	@Column(name="marriage_year", length=10)
	private String marriageYear;
	
	@Column(name="company_id", length=11, nullable=false)
	private Long companyId;
	
	@Column(name="is_process")
	private Boolean isProcess;

	@Column(name="is_complete")
	private Boolean isComplete;

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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Long getReligionId() {
		return religionId;
	}

	public void setReligionId(Long religionId) {
		this.religionId = religionId;
	}

	public Integer getHigh() {
		return high;
	}

	public void setHigh(Integer high) {
		this.high = high;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
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

	public Long getIdentityTypeId() {
		return identityTypeId;
	}

	public void setIdentityTypeId(Long identityTypeId) {
		this.identityTypeId = identityTypeId;
	}

	public String getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber1() {
		return phoneNumber1;
	}

	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getParentPhoneNumber() {
		return parentPhoneNumber;
	}

	public void setParentPhoneNumber(String parentPhoneNumber) {
		this.parentPhoneNumber = parentPhoneNumber;
	}

	public String getChildSequence() {
		return childSequence;
	}

	public void setChildSequence(String childSequence) {
		this.childSequence = childSequence;
	}

	public String getHowManyBrothers() {
		return howManyBrothers;
	}

	public void setHowManyBrothers(String howManyBrothers) {
		this.howManyBrothers = howManyBrothers;
	}

	public Long getMaritalStatusId() {
		return maritalStatusId;
	}

	public void setMaritalStatusId(Long maritalStatusId) {
		this.maritalStatusId = maritalStatusId;
	}

	public Long getAddrbookId() {
		return addrbookId;
	}

	public void setAddrbookId(Long addrbookId) {
		this.addrbookId = addrbookId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpiredToken() {
		return expiredToken;
	}

	public void setExpiredToken(Date expiredToken) {
		this.expiredToken = expiredToken;
	}

	public String getMarriageYear() {
		return marriageYear;
	}

	public void setMarriageYear(String marriageYear) {
		this.marriageYear = marriageYear;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Boolean getIsProcess() {
		return isProcess;
	}

	public void setIsProcess(Boolean isProcess) {
		this.isProcess = isProcess;
	}

	public Boolean getIsComplete() {
		return isComplete;
	}

	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	
}
