package com.eelectronics.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.eelectronics.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	private SessionFactory sessionFactory;
public ProductDaoImpl(){
	
}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addproduct(Product p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
	}
	public List<Product> listProduct() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productList = session.createQuery("from Product").list();
		return productList;
	}
	
	
	
}

