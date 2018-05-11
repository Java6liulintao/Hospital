package com.aaa.entity;

/**
 * Watebill entity. @author MyEclipse Persistence Tools
 */

public class Watebill implements java.io.Serializable {

	// Fields

	private WatebillId id;
	private Advice advice;
	private Accounts accounts;

	// Constructors

	/** default constructor */
	public Watebill() {
	}

	/** minimal constructor */
	public Watebill(WatebillId id) {
		this.id = id;
	}

	/** full constructor */
	public Watebill(WatebillId id, Advice advice, Accounts accounts) {
		this.id = id;
		this.advice = advice;
		this.accounts = accounts;
	}

	// Property accessors

	public WatebillId getId() {
		return this.id;
	}

	public void setId(WatebillId id) {
		this.id = id;
	}

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

}