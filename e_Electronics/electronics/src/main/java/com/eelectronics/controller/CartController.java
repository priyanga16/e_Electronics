package com.eelectronics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eelectronics.service.CustomerServiceImpl;
@Controller
public class CartController {
@Autowired
   CustomerServiceImpl customerService;
	
@RequestMapping("/cart")
	 public String cart() {
	   return "cart";
}
}