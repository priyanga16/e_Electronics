package com.eelectronics.dao;

import java.util.List;

import com.eelectronics.model.Product;

public interface ProductDao {
	public void addProduct(Product product);
    public List<Product> listProduct();
	public void updateProduct(Product product);
	public Product getProductById(int productid);
	public void deleteProduct(int productid);
		
	
	
}