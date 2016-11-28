package com.eelectronics.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eelectronics.model.Billingaddress;
import com.eelectronics.model.Customer;
import com.eelectronics.model.Shippingaddress;
import com.eelectronics.service.CustomerService;

@Controller
public class RegistrationController {
	
	@Autowired
	private CustomerService customerService;
	public CustomerService getCustomerService() {
		return customerService;
	}
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping("/register")
	public ModelAndView getRegistration(){
		Customer customer=new Customer();
		Billingaddress billingaddress=new Billingaddress();
		Shippingaddress shippingaddress=new Shippingaddress();
		customer.setBillingaddress(billingaddress);
		customer.setShippingaddress(shippingaddress);
		return new ModelAndView("register","customer",customer);
	}
 @RequestMapping(value="/register",method=RequestMethod.POST)
	public String registerCustomer(@Valid @ModelAttribute(value="customer") Customer customer,Model model,BindingResult result){
	if(result.hasErrors())
		return "register";
	customerService.addCustomer(customer);
	model.addAttribute("registrationsuccess","login with your username and password");
	return "login";
	
	}

 
}


