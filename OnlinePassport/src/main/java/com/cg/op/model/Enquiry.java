package com.cg.op.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enquiry")
public class Enquiry {
	@Id
	@Column(name="enquiry_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long enquiryid;
	@Column(name="passport_no")
	private long passportno;
	@Column(name="enquiry_date")
	private LocalDate enquirydate;
	@Column(name="enquiry_status")
	private String enquirystatus;
	@Column(name="enquiry_desc")
	private String enquirydesc;
	
	public Enquiry() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Enquiry(long enquiryid, long passportno, LocalDate enquirydate, String enquirystatus, String enquirydesc) {
		super();
		this.enquiryid = enquiryid;
		this.passportno = passportno;
		this.enquirydate = enquirydate;
		this.enquirystatus = enquirystatus;
		this.enquirydesc = enquirydesc;
	}


	public long getEnquiryid() {
		return enquiryid;
	}
	public void setEnquiryid(long enquiryid) {
		this.enquiryid = enquiryid;
	}
	public long getPassportno() {
		return passportno;
	}
	public void setPassportno(long passportno) {
		this.passportno = passportno;
	}
	public LocalDate getEnquirydate() {
		return enquirydate;
	}
	public void setEnquirydate(LocalDate date) {
		this.enquirydate = date;
	}
	public String getEnquirystatus() {
		return enquirystatus;
	}
	public void setEnquirystatus(String enquirystatus) {
		this.enquirystatus = enquirystatus;
	}
	public String getEnquirydesc() {
		return enquirydesc;
	}
	public void setEnquirydesc(String enquirydesc) {
		this.enquirydesc = enquirydesc;
	}
}