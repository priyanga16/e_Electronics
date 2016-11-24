package com.eelectronics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Product {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int productid;
	private String productname;
	 private String productdescription;
	 private int productprice;
	 private int unitinstock;
	private int category;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public int getUnitinstock() {
		return unitinstock;
	}
	public void setUnitinstock(int unitinstock) {
		this.unitinstock = unitinstock;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	 
}
	}
