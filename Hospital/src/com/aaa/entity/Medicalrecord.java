package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Medicalrecord entity. @author MyEclipse Persistence Tools
 */

public class Medicalrecord implements java.io.Serializable {

	// Fields

	private Integer medicalRecordId;
	private Patient2 patient2;
	private Clinicregister clinicregister;
	private Integer age3;
	private String stuffId11;
	private String acceptsType;
	private String enquire;
	private String curesuggest;
	private Date visitTime3;
	private Set illnesscases = new HashSet(0);
	private Set clinicregisters = new HashSet(0);
	private Set cures = new HashSet(0);

	// Constructors

	/** default constructor */
	public Medicalrecord() {
	}

	/** full constructor */
	public Medicalrecord(Patient2 patient2, Clinicregister clinicregister, Integer age3, String stuffId11,
			String acceptsType, String enquire, String curesuggest, Date visitTime3, Set illnesscases,
			Set clinicregisters, Set cures) {
		this.patient2 = patient2;
		this.clinicregister = clinicregister;
		this.age3 = age3;
		this.stuffId11 = stuffId11;
		this.acceptsType = acceptsType;
		this.enquire = enquire;
		this.curesuggest = curesuggest;
		this.visitTime3 = visitTime3;
		this.illnesscases = illnesscases;
		this.clinicregisters = clinicregisters;
		this.cures = cures;
	}

	// Property accessors

	public Integer getMedicalRecordId() {
		return this.medicalRecordId;
	}

	public void setMedicalRecordId(Integer medicalRecordId) {
		this.medicalRecordId = medicalRecordId;
	}

	public Patient2 getPatient2() {
		return this.patient2;
	}

	public void setPatient2(Patient2 patient2) {
		this.patient2 = patient2;
	}

	public Clinicregister getClinicregister() {
		return this.clinicregister;
	}

	public void setClinicregister(Clinicregister clinicregister) {
		this.clinicregister = clinicregister;
	}

	public Integer getAge3() {
		return this.age3;
	}

	public void setAge3(Integer age3) {
		this.age3 = age3;
	}

	public String getStuffId11() {
		return this.stuffId11;
	}

	public void setStuffId11(String stuffId11) {
		this.stuffId11 = stuffId11;
	}

	public String getAcceptsType() {
		return this.acceptsType;
	}

	public void setAcceptsType(String acceptsType) {
		this.acceptsType = acceptsType;
	}

	public String getEnquire() {
		return this.enquire;
	}

	public void setEnquire(String enquire) {
		this.enquire = enquire;
	}

	public String getCuresuggest() {
		return this.curesuggest;
	}

	public void setCuresuggest(String curesuggest) {
		this.curesuggest = curesuggest;
	}

	public Date getVisitTime3() {
		return this.visitTime3;
	}

	public void setVisitTime3(Date visitTime3) {
		this.visitTime3 = visitTime3;
	}

	public Set getIllnesscases() {
		return this.illnesscases;
	}

	public void setIllnesscases(Set illnesscases) {
		this.illnesscases = illnesscases;
	}

	public Set getClinicregisters() {
		return this.clinicregisters;
	}

	public void setClinicregisters(Set clinicregisters) {
		this.clinicregisters = clinicregisters;
	}

	public Set getCures() {
		return this.cures;
	}

	public void setCures(Set cures) {
		this.cures = cures;
	}

}