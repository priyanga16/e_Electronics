package com.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HelloController {
	@RequestMapping(value = "/")
	public ModelAndView hello(){
		System.out.println("TEST");
	String message = "HELLO SPRING MVC HOW R U";  
    return new ModelAndView("hellopage", "message", message);  
}
}