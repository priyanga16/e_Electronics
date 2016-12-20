package com.eelectronics.dao;

import java.util.List;

import com.eelectronics.model.Customer;

public interface CustomerDao {

	/*public void addCustomer(Customer customer);*/
	void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);
	
	
	
}
