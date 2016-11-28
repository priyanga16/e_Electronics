package com.eelectronics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.eelectronics.model.Customer;
import com.eelectronics.service.CustomerServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
   CustomerServiceImpl customerService;
	
	@RequestMapping("/")
	 public String hello() {
	   return "hello";
}
 @RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false) String error,
			@RequestParam(value="logout",required=false)String logout, Model model){
	 if(error!=null)
		 model.addAttribute("error","invalid username and password");
	 
	 if(logout!=null)
		model.addAttribute("logout","You have successfully logged out");
		return "login";
	}
 
 @RequestMapping("/logout")
 public String logout(){
	return "redirect:/";
 }

/* @RequestMapping(value ="/addcustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer){   
	 
	 	customerService.addCustomer(customer);
	        return "redirect:/home";
	    
}*/
 
}
