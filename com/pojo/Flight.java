package com.pojo;

// Generated 28 Jan, 2019 6:23:47 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Flight generated by hbm2java
 */
public class Flight implements java.io.Serializable {

	private Integer fid;
	private Registrationdata registrationdata;
	private String flightname;
	private String duration;
	private Integer flightrate;
	private String source;
	private String destination;
	private Date flightdate;
	private String flighttime;
	private String flightimg;
	private Set bookedtickets = new HashSet(0);

	public Flight() {
	}

	public Flight(Registrationdata registrationdata, String flightname, String duration, Integer flightrate,
			String source, String destination, Date flightdate, String flighttime, String flightimg, Set bookedtickets) {
		this.registrationdata = registrationdata;
		this.flightname = flightname;
		this.duration = duration;
		this.flightrate = flightrate;
		this.source = source;
		this.destination = destination;
		this.flightdate = flightdate;
		this.flighttime = flighttime;
		this.flightimg = flightimg;
		this.bookedtickets = bookedtickets;
	}

	public Integer getFid() {
		return this.fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public Registrationdata getRegistrationdata() {
		return this.registrationdata;
	}

	public void setRegistrationdata(Registrationdata registrationdata) {
		this.registrationdata = registrationdata;
	}

	public String getFlightname() {
		return this.flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Integer getFlightrate() {
		return this.flightrate;
	}

	public void setFlightrate(Integer flightrate) {
		this.flightrate = flightrate;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getFlightdate() {
		return this.flightdate;
	}

	public void setFlightdate(Date flightdate) {
		this.flightdate = flightdate;
	}

	public String getFlighttime() {
		return this.flighttime;
	}

	public void setFlighttime(String flighttime) {
		this.flighttime = flighttime;
	}

	public String getFlightimg() {
		return this.flightimg;
	}

	public void setFlightimg(String flightimg) {
		this.flightimg = flightimg;
	}

	public Set getBookedtickets() {
		return this.bookedtickets;
	}

	public void setBookedtickets(Set bookedtickets) {
		this.bookedtickets = bookedtickets;
	}

}
