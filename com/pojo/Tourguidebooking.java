package com.pojo;

// Generated 28 Jan, 2019 6:23:47 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Tourguidebooking generated by hbm2java
 */
public class Tourguidebooking implements java.io.Serializable {

	private Integer tgbookid;
	private Registrationdata registrationdata;
	private Tourguide tourguide;
	private Date bookingdate;

	public Tourguidebooking() {
	}

	public Tourguidebooking(Registrationdata registrationdata, Tourguide tourguide, Date bookingdate) {
		this.registrationdata = registrationdata;
		this.tourguide = tourguide;
		this.bookingdate = bookingdate;
	}

	public Integer getTgbookid() {
		return this.tgbookid;
	}

	public void setTgbookid(Integer tgbookid) {
		this.tgbookid = tgbookid;
	}

	public Registrationdata getRegistrationdata() {
		return this.registrationdata;
	}

	public void setRegistrationdata(Registrationdata registrationdata) {
		this.registrationdata = registrationdata;
	}

	public Tourguide getTourguide() {
		return this.tourguide;
	}

	public void setTourguide(Tourguide tourguide) {
		this.tourguide = tourguide;
	}

	public Date getBookingdate() {
		return this.bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}

}
