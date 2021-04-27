package com.cg.op.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
@Entity
@Table(name = "verification")
public class Verification {

    @Id
    @Column(name = "verification_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long verifyid;

    @Column(name= "passportno")
    private long passportNo;

    @Column(name = "enquiry_date")
    private LocalDate verifydate;

    @Column(name= "verify_status")
    private String verifystatus;

    @Column(name="verifyername")
    private String verifyername;

    
    @Override
	public String toString() {
		return "Verification [verifyid=" + verifyid + ", passportNo=" + passportNo + ", verifydate=" + verifydate
				+ ", verifystatus=" + verifystatus + ", verifyername=" + verifyername + "]";
	}

	public Verification(long verifyid, long passportNo, LocalDate verifydate, String verifystatus, String verifyername) {
		super();
		this.verifyid = verifyid;
		this.passportNo = passportNo;
		this.verifydate = verifydate;
		this.verifystatus = verifystatus;
		this.verifyername = verifyername;
	}
	

	public Verification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getVerifyid() {
        return verifyid;
    }

    public void setVerifyid(long verifyid) {
        this.verifyid = verifyid;
    }

    public long getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(long passportNo) {
        this.passportNo = passportNo;
    }

    public LocalDate getVerifydate() {
        return verifydate;
    }

    public void setVerifydate(LocalDate verifydate) {
        this.verifydate = verifydate;
    }

    public String getVerifystatus() {
        return verifystatus;
    }

    public void setVerifystatus(String verifystatus) {
        this.verifystatus = verifystatus;
    }

    public String getVerifyername() {
        return verifyername;
    }

    public void setVerifyername(String verifyername) {
        this.verifyername = verifyername;
    }
}
