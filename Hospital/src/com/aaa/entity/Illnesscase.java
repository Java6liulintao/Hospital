package com.aaa.entity;

/**
 * Illnesscase entity. @author MyEclipse Persistence Tools
 */

public class Illnesscase implements java.io.Serializable {

	// Fields

	private Integer illnessCaseId;
	private Medicalrecord medicalrecord;
	private String illnessCaseName;

	// Constructors

	/** default constructor */
	public Illnesscase() {
	}

	/** full constructor */
	public Illnesscase(Medicalrecord medicalrecord, String illnessCaseName) {
		this.medicalrecord = medicalrecord;
		this.illnessCaseName = illnessCaseName;
	}

	// Property accessors

	public Integer getIllnessCaseId() {
		return this.illnessCaseId;
	}

	public void setIllnessCaseId(Integer illnessCaseId) {
		this.illnessCaseId = illnessCaseId;
	}

	public Medicalrecord getMedicalrecord() {
		return this.medicalrecord;
	}

	public void setMedicalrecord(Medicalrecord medicalrecord) {
		this.medicalrecord = medicalrecord;
	}

	public String getIllnessCaseName() {
		return this.illnessCaseName;
	}

	public void setIllnessCaseName(String illnessCaseName) {
		this.illnessCaseName = illnessCaseName;
	}

}