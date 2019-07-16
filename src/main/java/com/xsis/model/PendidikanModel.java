package com.xsis.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class PendidikanModel {


@Entity
@Table(name = "barang")
public class Barang {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	
}
	
}
