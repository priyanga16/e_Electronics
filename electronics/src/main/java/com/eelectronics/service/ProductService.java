package com.eelectronics.service;

import java.util.List;

import com.eelectronics.model.Product;

public interface ProductService {

public void addproduct(Product product);
public List<Product> listProduct();
}