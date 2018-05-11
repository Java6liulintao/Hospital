package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Examineorder entity. @author MyEclipse Persistence Tools
 */

public class Examineorder implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Patient2 patient2;
	private Cure cure;
	private Date orderTime;
	private String floorId4;
	private String stuffId11;
	private Date processingTime;
	private Integer state8;
	private Integer reportId;
	private Set cures = new HashSet(0);

	// Constructors

	/** default constructor */
	public Examineorder() {
	}

	/** full constructor */
	public Examineorder(Patient2 patient2, Cure cure, Date orderTime, String floorId4, String stuffId11,
			Date processingTime, Integer state8, Integer reportId, Set cures) {
		this.patient2 = patient2;
		this.cure = cure;
		this.orderTime = orderTime;
		this.floorId4 = floorId4;
		this.stuffId11 = stuffId11;
		this.processingTime = processingTime;
		this.state8 = state8;
		this.reportId = reportId;
		this.cures = cures;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getFloorId4() {
		return this.floorId4;
	}

	public void setFloorId4(String floorId4) {
		this.floorId4 = floorId4;
	}

	public String getStuffId11() {
		return this.stuffId11;
	}

	public void setStuffId11(String stuffId11) {
		this.stuffId11 = stuffId11;
	}

	public Date getProcessingTime() {
		return this.processingTime;
	}

	public void setProcessingTime(Date processingTime) {
		this.processingTime = processingTime;
	}

	public Integer getState8() {
		return this.state8;
	}

	public void setState8(Integer state8) {
		this.state8 = state8;
	}

	public Integer getReportId() {
		return this.reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}

	public Set getCures() {
		return this.cures;
	}

	public void setCures(Set cures) {
		this.cures = cures;
	}

}