package com.aaa.entity;

import java.util.Date;

/**
 * WatebillId entity. @author MyEclipse Persistence Tools
 */

public class WatebillId implements java.io.Serializable {

	// Fields

	private Advice advice;
	private Accounts accounts;
	private String billid;
	private Date billdate;
	private String billexecutor;
	private String billcondition;

	// Constructors

	/** default constructor */
	public WatebillId() {
	}

	/** full constructor */
	public WatebillId(Advice advice, Accounts accounts, String billid, Date billdate, String billexecutor,
			String billcondition) {
		this.advice = advice;
		this.accounts = accounts;
		this.billid = billid;
		this.billdate = billdate;
		this.billexecutor = billexecutor;
		this.billcondition = billcondition;
	}

	// Property accessors

	public Advice getAdvice() {
		return this.advice;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

	public Accounts getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	public String getBillid() {
		return this.billid;
	}

	public void setBillid(String billid) {
		this.billid = billid;
	}

	public Date getBilldate() {
		return this.billdate;
	}

	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}

	public String getBillexecutor() {
		return this.billexecutor;
	}

	public void setBillexecutor(String billexecutor) {
		this.billexecutor = billexecutor;
	}

	public String getBillcondition() {
		return this.billcondition;
	}

	public void setBillcondition(String billcondition) {
		this.billcondition = billcondition;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WatebillId))
			return false;
		WatebillId castOther = (WatebillId) other;

		return ((this.getAdvice() == castOther.getAdvice()) || (this.getAdvice() != null
				&& castOther.getAdvice() != null && this.getAdvice().equals(castOther.getAdvice())))
				&& ((this.getAccounts() == castOther.getAccounts()) || (this.getAccounts() != null
						&& castOther.getAccounts() != null && this.getAccounts().equals(castOther.getAccounts())))
				&& ((this.getBillid() == castOther.getBillid()) || (this.getBillid() != null
						&& castOther.getBillid() != null && this.getBillid().equals(castOther.getBillid())))
				&& ((this.getBilldate() == castOther.getBilldate()) || (this.getBilldate() != null
						&& castOther.getBilldate() != null && this.getBilldate().equals(castOther.getBilldate())))
				&& ((this.getBillexecutor() == castOther.getBillexecutor())
						|| (this.getBillexecutor() != null && castOther.getBillexecutor() != null
								&& this.getBillexecutor().equals(castOther.getBillexecutor())))
				&& ((this.getBillcondition() == castOther.getBillcondition())
						|| (this.getBillcondition() != null && castOther.getBillcondition() != null
								&& this.getBillcondition().equals(castOther.getBillcondition())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAdvice() == null ? 0 : this.getAdvice().hashCode());
		result = 37 * result + (getAccounts() == null ? 0 : this.getAccounts().hashCode());
		result = 37 * result + (getBillid() == null ? 0 : this.getBillid().hashCode());
		result = 37 * result + (getBilldate() == null ? 0 : this.getBilldate().hashCode());
		result = 37 * result + (getBillexecutor() == null ? 0 : this.getBillexecutor().hashCode());
		result = 37 * result + (getBillcondition() == null ? 0 : this.getBillcondition().hashCode());
		return result;
	}

}