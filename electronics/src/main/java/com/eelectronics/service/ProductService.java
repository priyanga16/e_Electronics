package com.eelectronics.service;

import java.util.List;

import com.eelectronics.model.Product;

public interface ProductService {

public void addProduct(Product product);
public List<Product> listProduct();
public void updateProduct(Product product);
}