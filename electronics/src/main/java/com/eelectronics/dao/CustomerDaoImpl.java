package com.eelectronics.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eelectronics.model.Authorities;
import com.eelectronics.model.Customer;
import com.eelectronics.model.Users;

@Transactional
@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCustomer(Customer customer){		
		 Session session=sessionFactory.getCurrentSession();
		 Users user = new Users();
		 user.setUsername(customer.getUsername());
		 user.setPassword(customer.getPassword());
		 user.setEnabled(true);
		 session.saveOrUpdate(customer);
		 
		 
		 Authorities authorities = new Authorities();
		 authorities.setUsername(customer.getUsername());
		 authorities.setAuthority("ROLE_USER");
	}
}
