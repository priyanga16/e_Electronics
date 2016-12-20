package com.eelectronics.model;

import javax.persistence.*;

@Entity
public class CartItem {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int cartItemid;
@ManyToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
@JoinColumn(name="customerid")
private Cart cart;
@ManyToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
@JoinColumn(name="productid")
private Product product;
private int quantity;
private double totalPrice;


public int getCartItemid() {
	return cartItemid;
}
public void setCartItemid(int cartItemid) {
	this.cartItemid = cartItemid;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
}
