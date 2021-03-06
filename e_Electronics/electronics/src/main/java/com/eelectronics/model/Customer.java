package com.eelectronics.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
/*@Size(min=2,max=10,message="name has to bebetween 2 and 10 characters")
@N*/
 
 private String name;
 private String email;
 private String username;
 private String password;
 private String phone;
 @OneToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
 @JoinColumn(name="billingaddressid")
private Billingaddress billingaddress;
	 public Billingaddress getBillingaddress() {
	return billingaddress;
}
public void setBillingaddress(Billingaddress billingaddress) {
	this.billingaddress = billingaddress;
}
@OneToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
@JoinColumn(name="shippingaddressid")
private Shippingaddress shippingaddress;
	 public Shippingaddress getShippingaddress() {
	return shippingaddress;
}
public void setShippingaddress(Shippingaddress shippingaddress) {
	this.shippingaddress = shippingaddress;
}
@OneToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
@JoinColumn(name="cartid")
private Cart cart;
	public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
		
	 
	}
