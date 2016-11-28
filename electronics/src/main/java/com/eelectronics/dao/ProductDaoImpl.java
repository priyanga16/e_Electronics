package com.eelectronics.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eelectronics.model.Product;

@Transactional
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

	public void addProduct(Product product) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(product);
	}
	
	public List<Product> listProduct() {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("from Product").list();
	}
	public void updateProduct(Product product) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(product);
	}
	
	
	
}

