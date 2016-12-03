package com.eelectronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eelectronics.dao.ProductDao;
import com.eelectronics.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	public void addProduct(Product product) {
		this.productDao.addProduct(product);
		
	}

	public List<Product> listProduct() {
		return productDao.listProduct();
	}

	public void updateProduct(Product product) {
	
	    this.productDao.updateProduct(product);
	}
	
	
	public Product getProductById(int productid){
		
		return productDao.getProductById(productid);
			
	
	}
		
	public void deleteProduct(int productid)
	{
		productDao.deleteProduct(productid);
	}
}