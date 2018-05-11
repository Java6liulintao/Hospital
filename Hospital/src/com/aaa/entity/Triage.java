package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Triage entity. @author MyEclipse Persistence Tools
 */

public class Triage implements java.io.Serializable {

	// Fields

	private Integer triageId;
	private Clinicregister clinicregister;
	private String roomId4;
	private Integer state8;
	private String stuffId11;
	private Set clinicregisters = new HashSet(0);

	// Constructors

	/** default constructor */
	public Triage() {
	}

	/** full constructor */
	public Triage(Clinicregister clinicregister, String roomId4, Integer state8, String stuffId11,
			Set clinicregisters) {
		this.clinicregister = clinicregister;
		this.roomId4 = roomId4;
		this.state8 = state8;
		this.stuffId11 = stuffId11;
		this.clinicregisters = clinicregisters;
	}

	// Property accessors

	public Integer getTriageId() {
		return this.triageId;
	}

	public void setTriageId(Integer triageId) {
		this.triageId = triageId;
	}

	public Clinicregister getClinicregister() {
		return this.clinicregister;
	}

	public void setClinicregister(Clinicregister clinicregister) {
		this.clinicregister = clinicregister;
	}

	public String getRoomId4() {
		return this.roomId4;
	}

	public void setRoomId4(String roomId4) {
		this.roomId4 = roomId4;
	}

	public Integer getState8() {
		return this.state8;
	}

	public void setState8(Integer state8) {
		this.state8 = state8;
	}

	public String getStuffId11() {
		return this.stuffId11;
	}

	public void setStuffId11(String stuffId11) {
		this.stuffId11 = stuffId11;
	}

	public Set getClinicregisters() {
		return this.clinicregisters;
	}

	public void setClinicregisters(Set clinicregisters) {
		this.clinicregisters = clinicregisters;
	}

}