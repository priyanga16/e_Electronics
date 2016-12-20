package com.eelectronics.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Billingaddress implements Serializable {
	
	private static final long serialVersionUID = 5236616770714958973L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int billingaddressid;
	
	private String Apartmentnumber;
	 private String city;
	 private String state;
	 private String streetname;
	 @OneToOne(mappedBy="billingaddress",cascade=CascadeType.ALL)
	 private Customer customer;
	 public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
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
	

	 
}