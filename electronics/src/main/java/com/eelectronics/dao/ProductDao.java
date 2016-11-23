package com.eelectronics.dao;

import java.util.List;

import com.eelectronics.model.Product;

public interface ProductDao {
	public void addproduct(Product p);
    public List<Product> listProduct();
}