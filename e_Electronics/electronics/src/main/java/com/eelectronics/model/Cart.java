package com.eelectronics.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Cart implements Serializable{
	
	private static final long serialVersionUID = -861182740820116069L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartId;
	@OneToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
	@JoinColumn(name="customerid")
	private Customer customer;
	private double grandtotal;
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}
	public List<CartItem> getCartItems() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setGrandTotal(double grandTotal2) {
		// TODO Auto-generated method stub
		
	}
	
}
