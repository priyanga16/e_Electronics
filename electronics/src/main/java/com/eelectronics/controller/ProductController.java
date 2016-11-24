package com.eelectronics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
@RequestMapping(value="/list", method = RequestMethod.GET)
	public String listProduct(Model model) {
		model.addAttribute("productList",productService.listProduct());
		return "productList";
	}
@RequestMapping(value ="/product",method= RequestMethod.GET)
  public ModelAndView createProduct()
  {
  ModelAndView model = new ModelAndView("addproduct"); 
  model.addObject("product", new Product());
  return model;
  }
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String addproduct(@ModelAttribute("product") Product product){
		
		if(product.getProductid()==0){
	
			this.productService.addproduct(product);
		}
/*else{
			
			this.productService.updateProduct(p);
		}*/
		
		return "redirect:/list";
		
	}
}
