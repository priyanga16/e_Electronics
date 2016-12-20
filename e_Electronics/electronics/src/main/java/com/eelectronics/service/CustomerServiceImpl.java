package com.eelectronics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eelectronics.dao.CustomerDao;
import com.eelectronics.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
    private CustomerDao CustomerDao;	
	
	public void addCustomer(Customer customer){
		CustomerDao.addCustomer(customer);
		
	}
}
