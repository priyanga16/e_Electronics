package com.eelectronics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eelectronics.model.Product;
import com.eelectronics.service.ProductServiceImpl;

@Controller
public class ProductController {
	@Autowired
	   ProductServiceImpl productService;
	public ProductServiceImpl getProductService() {
		return productService;
	}

	public void setProductService(ProductServiceImpl productService) {
		this.productService = productService;
	}
@RequestMapping(value ="/product", method = RequestMethod.GET)
	public String listProduct(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("listProduct", this.productService.listProduct());
		return "productList";
	}
	
	//For add and update person both
	@RequestMapping(value="/addproduct", method = RequestMethod.POST)
	public String addproduct(@ModelAttribute("product") Product p){
		
		if(p.getProductid() == 0){
			//new person, add it
			this.productService.addproduct(p);
		}
/*else{
			//existing person, call update
			this.productService.updateProduct(p);
		}
		*/
		return "redirect:/product";
		
	}
}
