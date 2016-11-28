package com.eelectronics.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Shippingaddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int shippingaddressid;
	
	private String Apartmentnumber;
	private String streetname;
	 private String city;
	 private String state;
	 @OneToOne(mappedBy="shippingaddress",cascade=CascadeType.ALL)
	 private Customer customer;
	 public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	 public int getShippingaddressid() {
		return shippingaddressid;
	}
	public void setShippingaddressid(int shippingaddressid) {
		this.shippingaddressid = shippingaddressid;
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
