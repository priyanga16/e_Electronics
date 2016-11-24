package com.eelectronics.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eelectronics.dao.ProductDao;
import com.eelectronics.model.Product;
@Service
public class ProductServiceImpl implements ProductService{
	private ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	public void addproduct(Product product) {
		this.productDao.addproduct(product);
		
	}

	public List<Product> listProduct() {
		return productDao.listProduct();
	}
	}
