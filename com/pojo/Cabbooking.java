package com.pojo;

// Generated 28 Jan, 2019 6:23:47 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Cabbooking generated by hbm2java
 */
public class Cabbooking implements java.io.Serializable {

	private Integer cbookid;
	private Cabs cabs;
	private Registrationdata registrationdata;
	private Date bookingdate;
	private String noofpeople;

	public Cabbooking() {
	}

	public Cabbooking(Cabs cabs, Registrationdata registrationdata, Date bookingdate, String noofpeople) {
		this.cabs = cabs;
		this.registrationdata = registrationdata;
		this.bookingdate = bookingdate;
		this.noofpeople = noofpeople;
	}

	public Integer getCbookid() {
		return this.cbookid;
	}

	public void setCbookid(Integer cbookid) {
		this.cbookid = cbookid;
	}

	public Cabs getCabs() {
		return this.cabs;
	}

	public void setCabs(Cabs cabs) {
		this.cabs = cabs;
	}

	public Registrationdata getRegistrationdata() {
		return this.registrationdata;
	}

	public void setRegistrationdata(Registrationdata registrationdata) {
		this.registrationdata = registrationdata;
	}

	public Date getBookingdate() {
		return this.bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}

	public String getNoofpeople() {
		return this.noofpeople;
	}

	public void setNoofpeople(String noofpeople) {
		this.noofpeople = noofpeople;
	}

}
