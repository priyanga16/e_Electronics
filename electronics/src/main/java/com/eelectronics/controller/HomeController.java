package com.eelectronics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eelectronics.model.Customer;
import com.eelectronics.service.CustomerService;

@Controller
public class HomeController {
	
	@Autowired
   CustomerService customerService;
	
	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	@RequestMapping("/")
	 public String hello() {
	   return "hello";
}
 @RequestMapping("/login")
	public String login(){
		return "login";
	
	}
 @RequestMapping("/register")
	public String register(Model model){
	 Customer customer = new Customer();
	 model.addAttribute("customer", customer);
	 return "register";
}

 @RequestMapping(value ="/addcustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer){   
	 
	 	customerService.addCustomer(customer);
	        return "redirect:/home";
	    
}
 
 

 
}
