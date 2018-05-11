package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Patient entity. @author MyEclipse Persistence Tools
 */

public class Patient implements java.io.Serializable {

	// Fields

	private Integer pid;
	private Stuff stuff;
	private Outhospital outhospital;
	private Department department;
	private Inpatientarea inpatientarea;
	private String pname;
	private String pcard;
	private Date pbirthday;
	private String sex;
	private Integer page;
	private String pstatus;
	private String profession;
	private String birthplace;
	private String nation;
	private String nationality;
	private String work;
	private String address;
	private String phone;
	private String zip;
	private String pemanentAddress;
	private String contactName;
	private String contactAddress;
	private String contactPhone;
	private Date pdate;
	private String presult;
	private Integer pstate;
	private Set outhospitals = new HashSet(0);
	private Set advices = new HashSet(0);
	private Set accountses = new HashSet(0);
	private Set relationship42s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Patient() {
	}

	/** full constructor */
	public Patient(Stuff stuff, Outhospital outhospital, Department department, Inpatientarea inpatientarea,
			String pname, String pcard, Date pbirthday, String sex, Integer page, String pstatus, String profession,
			String birthplace, String nation, String nationality, String work, String address, String phone, String zip,
			String pemanentAddress, String contactName, String contactAddress, String contactPhone, Date pdate,
			String presult, Integer pstate, Set outhospitals, Set advices, Set accountses, Set relationship42s) {
		this.stuff = stuff;
		this.outhospital = outhospital;
		this.department = department;
		this.inpatientarea = inpatientarea;
		this.pname = pname;
		this.pcard = pcard;
		this.pbirthday = pbirthday;
		this.sex = sex;
		this.page = page;
		this.pstatus = pstatus;
		this.profession = profession;
		this.birthplace = birthplace;
		this.nation = nation;
		this.nationality = nationality;
		this.work = work;
		this.address = address;
		this.phone = phone;
		this.zip = zip;
		this.pemanentAddress = pemanentAddress;
		this.contactName = contactName;
		this.contactAddress = contactAddress;
		this.contactPhone = contactPhone;
		this.pdate = pdate;
		this.presult = presult;
		this.pstate = pstate;
		this.outhospitals = outhospitals;
		this.advices = advices;
		this.accountses = accountses;
		this.relationship42s = relationship42s;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Stuff getStuff() {
		return this.stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}

	public Outhospital getOuthospital() {
		return this.outhospital;
	}

	public void setOuthospital(Outhospital outhospital) {
		this.outhospital = outhospital;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Inpatientarea getInpatientarea() {
		return this.inpatientarea;
	}

	public void setInpatientarea(Inpatientarea inpatientarea) {
		this.inpatientarea = inpatientarea;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcard() {
		return this.pcard;
	}

	public void setPcard(String pcard) {
		this.pcard = pcard;
	}

	public Date getPbirthday() {
		return this.pbirthday;
	}

	public void setPbirthday(Date pbirthday) {
		this.pbirthday = pbirthday;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getPstatus() {
		return this.pstatus;
	}

	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getBirthplace() {
		return this.birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getWork() {
		return this.work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPemanentAddress() {
		return this.pemanentAddress;
	}

	public void setPemanentAddress(String pemanentAddress) {
		this.pemanentAddress = pemanentAddress;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public Date getPdate() {
		return this.pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public String getPresult() {
		return this.presult;
	}

	public void setPresult(String presult) {
		this.presult = presult;
	}

	public Integer getPstate() {
		return this.pstate;
	}

	public void setPstate(Integer pstate) {
		this.pstate = pstate;
	}

	public Set getOuthospitals() {
		return this.outhospitals;
	}

	public void setOuthospitals(Set outhospitals) {
		this.outhospitals = outhospitals;
	}

	public Set getAdvices() {
		return this.advices;
	}

	public void setAdvices(Set advices) {
		this.advices = advices;
	}

	public Set getAccountses() {
		return this.accountses;
	}

	public void setAccountses(Set accountses) {
		this.accountses = accountses;
	}

	public Set getRelationship42s() {
		return this.relationship42s;
	}

	public void setRelationship42s(Set relationship42s) {
		this.relationship42s = relationship42s;
	}

}