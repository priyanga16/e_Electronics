package com.eelectronics.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class CustomerOrder implements Serializable {

	private static final long serialVersionUID = -3451357137433511311L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerOrderId;
	
	public int getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(int customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Billingaddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Billingaddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Shippingaddress getShippingAddressId() {
		return shippingAddressId;
	}

	public void setShippingAddressId(Shippingaddress shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "cartId")
	private Cart cart;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "billingAddressId")
	private Billingaddress billingAddress;

	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "shippingAddress")
	private Shippingaddress shippingAddressId;
	
	
	}