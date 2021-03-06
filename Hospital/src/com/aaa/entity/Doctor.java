package com.aaa.entity;

/**
 * Doctor entity. @author MyEclipse Persistence Tools
 */

public class Doctor implements java.io.Serializable {

	// Fields

	private Integer doctorId3;
	private Chineseprescribe chineseprescribe;
	private Westernprescribe westernprescribe;
	private Clinicregister clinicregister;
	private String doctorName;
	private String sex4;
	private Integer age3;
	private String attending;
	private Integer phone4;

	// Constructors

	/** default constructor */
	public Doctor() {
	}

	/** full constructor */
	public Doctor(Chineseprescribe chineseprescribe, Westernprescribe westernprescribe, Clinicregister clinicregister,
			String doctorName, String sex4, Integer age3, String attending, Integer phone4) {
		this.chineseprescribe = chineseprescribe;
		this.westernprescribe = westernprescribe;
		this.clinicregister = clinicregister;
		this.doctorName = doctorName;
		this.sex4 = sex4;
		this.age3 = age3;
		this.attending = attending;
		this.phone4 = phone4;
	}

	// Property accessors

	public Integer getDoctorId3() {
		return this.doctorId3;
	}

	public void setDoctorId3(Integer doctorId3) {
		this.doctorId3 = doctorId3;
	}

	public Chineseprescribe getChineseprescribe() {
		return this.chineseprescribe;
	}

	public void setChineseprescribe(Chineseprescribe chineseprescribe) {
		this.chineseprescribe = chineseprescribe;
	}

	public Westernprescribe getWesternprescribe() {
		return this.westernprescribe;
	}

	public void setWesternprescribe(Westernprescribe westernprescribe) {
		this.westernprescribe = westernprescribe;
	}

	public Clinicregister getClinicregister() {
		return this.clinicregister;
	}

	public void setClinicregister(Clinicregister clinicregister) {
		this.clinicregister = clinicregister;
	}

	public String getDoctorName() {
		return this.doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSex4() {
		return this.sex4;
	}

	public void setSex4(String sex4) {
		this.sex4 = sex4;
	}

	public Integer getAge3() {
		return this.age3;
	}

	public void setAge3(Integer age3) {
		this.age3 = age3;
	}

	public String getAttending() {
		return this.attending;
	}

	public void setAttending(String attending) {
		this.attending = attending;
	}

	public Integer getPhone4() {
		return this.phone4;
	}

	public void setPhone4(Integer phone4) {
		this.phone4 = phone4;
	}

}