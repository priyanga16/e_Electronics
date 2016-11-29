package com.eelectronics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping("/")
	 public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	  
	   model.addAttribute("name", name);
	   //returns the view name
	   return "hello";
}
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}