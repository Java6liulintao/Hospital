package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Charge entity. @author MyEclipse Persistence Tools
 */

public class Charge implements java.io.Serializable {

	// Fields

	private Integer tollId;
	private Patient2 patient2;
	private Cure cure;
	private String registrationToll;
	private String pillToll;
	private String checkToll;
	private String checkoutToll;
	private String opstoll;
	private Set particularses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Charge() {
	}

	/** full constructor */
	public Charge(Patient2 patient2, Cure cure, String registrationToll, String pillToll, String checkToll,
			String checkoutToll, String opstoll, Set particularses) {
		this.patient2 = patient2;
		this.cure = cure;
		this.registrationToll = registrationToll;
		this.pillToll = pillToll;
		this.checkToll = checkToll;
		this.checkoutToll = checkoutToll;
		this.opstoll = opstoll;
		this.particularses = particularses;
	}

	// Property accessors

	public Integer getTollId() {
		return this.tollId;
	}

	public void setTollId(Integer tollId) {
		this.tollId = tollId;
	}

	public Patient2 getPatient2() {
		return this.patient2;
	}

	public void setPatient2(Patient2 patient2) {
		this.patient2 = patient2;
	}

	public Cure getCure() {
		return this.cure;
	}

	public void setCure(Cure cure) {
		this.cure = cure;
	}

	public String getRegistrationToll() {
		return this.registrationToll;
	}

	public void setRegistrationToll(String registrationToll) {
		this.registrationToll = registrationToll;
	}

	public String getPillToll() {
		return this.pillToll;
	}

	public void setPillToll(String pillToll) {
		this.pillToll = pillToll;
	}

	public String getCheckToll() {
		return this.checkToll;
	}

	public void setCheckToll(String checkToll) {
		this.checkToll = checkToll;
	}

	public String getCheckoutToll() {
		return this.checkoutToll;
	}

	public void setCheckoutToll(String checkoutToll) {
		this.checkoutToll = checkoutToll;
	}

	public String getOpstoll() {
		return this.opstoll;
	}

	public void setOpstoll(String opstoll) {
		this.opstoll = opstoll;
	}

	public Set getParticularses() {
		return this.particularses;
	}

	public void setParticularses(Set particularses) {
		this.particularses = particularses;
	}

}