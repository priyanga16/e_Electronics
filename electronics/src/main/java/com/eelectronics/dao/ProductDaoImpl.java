package com.eelectronics.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eelectronics.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
public ProductDaoImpl(){
	
}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addproduct(Product product) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
	}
	public List<Product> listProduct() {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("from Product").list();
	}
	
	
	
}

