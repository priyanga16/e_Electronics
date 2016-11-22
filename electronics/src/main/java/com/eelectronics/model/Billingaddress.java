package com.eelectronics.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Billingaddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int billingaddressid;
	
	private String Apartmentnumber;
	 private String city;
	 private String state;
	 private String streetname;
	 public int getBillingaddressid() {
		return billingaddressid;
	}
	public void setBillingaddressid(int billingaddressid) {
		this.billingaddressid = billingaddressid;
	}
	public String getApartmentnumber() {
		return Apartmentnumber;
	}
	public void setApartmentnumber(String apartmentnumber) {
		Apartmentnumber = apartmentnumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	private int zipcode;

	 
}