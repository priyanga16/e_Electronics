package com.eelectronics.service;


import com.eelectronics.model.CustomerOrder;

public interface CustomerOrderService {
	
	
	double getCustomerOrderGrandTotal(int cartId);

	void addCustomerOrder(CustomerOrder customerOrder);

	
	
}
