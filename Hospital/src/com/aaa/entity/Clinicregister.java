package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Clinicregister entity. @author MyEclipse Persistence Tools
 */

public class Clinicregister implements java.io.Serializable {

	// Fields

	private Integer registerId;
	private Subscribe subscribe;
	private Medicalrecord medicalrecord;
	private Triage triage;
	private Icclip icclip;
	private String stuffId11;
	private String departmentId4;
	private Integer number;
	private Date presentTime;
	private Integer empId;
	private String floorId4;
	private Set medicalrecords = new HashSet(0);
	private Set subscribes = new HashSet(0);
	private Set triages = new HashSet(0);
	private Set doctors = new HashSet(0);
	private Set departments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Clinicregister() {
	}

	/** full constructor */
	public Clinicregister(Subscribe subscribe, Medicalrecord medicalrecord, Triage triage, Icclip icclip,
			String stuffId11, String departmentId4, Integer number, Date presentTime, Integer empId, String floorId4,
			Set medicalrecords, Set subscribes, Set triages, Set doctors, Set departments) {
		this.subscribe = subscribe;
		this.medicalrecord = medicalrecord;
		this.triage = triage;
		this.icclip = icclip;
		this.stuffId11 = stuffId11;
		this.departmentId4 = departmentId4;
		this.number = number;
		this.presentTime = presentTime;
		this.empId = empId;
		this.floorId4 = floorId4;
		this.medicalrecords = medicalrecords;
		this.subscribes = subscribes;
		this.triages = triages;
		this.doctors = doctors;
		this.departments = departments;
	}

	// Property accessors

	public Integer getRegisterId() {
		return this.registerId;
	}

	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}

	public Subscribe getSubscribe() {
		return this.subscribe;
	}

	public void setSubscribe(Subscribe subscribe) {
		this.subscribe = subscribe;
	}

	public Medicalrecord getMedicalrecord() {
		return this.medicalrecord;
	}

	public void setMedicalrecord(Medicalrecord medicalrecord) {
		this.medicalrecord = medicalrecord;
	}

	public Triage getTriage() {
		return this.triage;
	}

	public void setTriage(Triage triage) {
		this.triage = triage;
	}

	public Icclip getIcclip() {
		return this.icclip;
	}

	public void setIcclip(Icclip icclip) {
		this.icclip = icclip;
	}

	public String getStuffId11() {
		return this.stuffId11;
	}

	public void setStuffId11(String stuffId11) {
		this.stuffId11 = stuffId11;
	}

	public String getDepartmentId4() {
		return this.departmentId4;
	}

	public void setDepartmentId4(String departmentId4) {
		this.departmentId4 = departmentId4;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getPresentTime() {
		return this.presentTime;
	}

	public void setPresentTime(Date presentTime) {
		this.presentTime = presentTime;
	}

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFloorId4() {
		return this.floorId4;
	}

	public void setFloorId4(String floorId4) {
		this.floorId4 = floorId4;
	}

	public Set getMedicalrecords() {
		return this.medicalrecords;
	}

	public void setMedicalrecords(Set medicalrecords) {
		this.medicalrecords = medicalrecords;
	}

	public Set getSubscribes() {
		return this.subscribes;
	}

	public void setSubscribes(Set subscribes) {
		this.subscribes = subscribes;
	}

	public Set getTriages() {
		return this.triages;
	}

	public void setTriages(Set triages) {
		this.triages = triages;
	}

	public Set getDoctors() {
		return this.doctors;
	}

	public void setDoctors(Set doctors) {
		this.doctors = doctors;
	}

	public Set getDepartments() {
		return this.departments;
	}

	public void setDepartments(Set departments) {
		this.departments = departments;
	}

}