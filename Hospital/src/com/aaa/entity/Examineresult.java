package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Examineresult entity. @author MyEclipse Persistence Tools
 */

public class Examineresult implements java.io.Serializable {

	// Fields

	private Integer examineResultId;
	private Checktype checktype;
	private Patient2 patient2;
	private String departmentId4;
	private String examineResult;
	private String nature;
	private String stuffId11;
	private Date checkDate;
	private String remark6;
	private Date reportTime;
	private Set checktypes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Examineresult() {
	}

	/** full constructor */
	public Examineresult(Checktype checktype, Patient2 patient2, String departmentId4, String examineResult,
			String nature, String stuffId11, Date checkDate, String remark6, Date reportTime, Set checktypes) {
		this.checktype = checktype;
		this.patient2 = patient2;
		this.departmentId4 = departmentId4;
		this.examineResult = examineResult;
		this.nature = nature;
		this.stuffId11 = stuffId11;
		this.checkDate = checkDate;
		this.remark6 = remark6;
		this.reportTime = reportTime;
		this.checktypes = checktypes;
	}

	// Property accessors

	public Integer getExamineResultId() {
		return this.examineResultId;
	}

	public void setExamineResultId(Integer examineResultId) {
		this.examineResultId = examineResultId;
	}

	public Checktype getChecktype() {
		return this.checktype;
	}

	public void setChecktype(Checktype checktype) {
		this.checktype = checktype;
	}

	public Patient2 getPatient2() {
		return this.patient2;
	}

	public void setPatient2(Patient2 patient2) {
		this.patient2 = patient2;
	}

	public String getDepartmentId4() {
		return this.departmentId4;
	}

	public void setDepartmentId4(String departmentId4) {
		this.departmentId4 = departmentId4;
	}

	public String getExamineResult() {
		return this.examineResult;
	}

	public void setExamineResult(String examineResult) {
		this.examineResult = examineResult;
	}

	public String getNature() {
		return this.nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getStuffId11() {
		return this.stuffId11;
	}

	public void setStuffId11(String stuffId11) {
		this.stuffId11 = stuffId11;
	}

	public Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getRemark6() {
		return this.remark6;
	}

	public void setRemark6(String remark6) {
		this.remark6 = remark6;
	}

	public Date getReportTime() {
		return this.reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public Set getChecktypes() {
		return this.checktypes;
	}

	public void setChecktypes(Set checktypes) {
		this.checktypes = checktypes;
	}

}