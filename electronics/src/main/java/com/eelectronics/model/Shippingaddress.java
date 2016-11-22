package com.eelectronics.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Shippingaddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int shippingaddressid;
	
	private String Apartmentnumber;
	 private String city;
	 private String state;
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
	private String streetname;

}
