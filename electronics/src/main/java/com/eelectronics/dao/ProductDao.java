package com.eelectronics.dao;

import java.util.List;

import com.eelectronics.model.Product;

public interface ProductDao {
	public void addproduct(Product product);
    public List<Product> listProduct();
}