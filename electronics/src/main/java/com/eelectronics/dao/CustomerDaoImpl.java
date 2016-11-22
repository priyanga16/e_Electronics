package com.eelectronics.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eelectronics.model.Customer;

@Transactional
@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCustomer(Customer customer){		
		 sessionFactory.getCurrentSession().saveOrUpdate(customer);
		 
	}
}
