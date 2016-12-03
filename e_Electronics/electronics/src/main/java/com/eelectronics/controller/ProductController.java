package com.eelectronics.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
@RequestMapping(value="/list")
	public String listProduct(Model model) {
		model.addAttribute("productList",productService.listProduct());
		return "productList";
	}
@RequestMapping(value ="/product")
  public ModelAndView createProduct()
  {
  ModelAndView model = new ModelAndView("addproduct"); 
  model.addObject("product", new Product());
  return model;
  }
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("product") Product product){
		
		System.out.println("test");
		if(product.getProductid()==0){
	
			productService.addProduct(product);
		}
		else{
			System.out.println("test11");
			productService.updateProduct(product);
}
		
		return "redirect:/list";
		
	}
	/*@RequestMapping(value ="/updateProduct/{productid}")
	  public String updateProduct(@ModelAttribute("product") Product product, Model model)
	  {	  
		//ModelAndView model = new ModelAndView("update");
		model.addAttribute("product", product);
		return "addproduct";
	  
	  }*/
	
	
    @RequestMapping(value = "/updateProduct/{productid}", method = RequestMethod.GET)
    public String updateProduct(@PathVariable("productid") int productid, Model model) {
        Product product = productService.getProductById(productid);

        model.addAttribute("product", product);

        return "addproduct";
    }

    /*@RequestMapping(value="/product/editProduct", method = RequestMethod.POST)
    public String editProductPost(@Valid @ModelAttribute("product") Product product, BindingResult result,HttpServletRequest request) {
        if(result.hasErrors()) {
            return "update";
        }

        productService.updateProduct(product);

        return "redirect:/productList";
    }*/

    @RequestMapping("/deleteProduct/{productid}")
    public String deleteProduct(@PathVariable int productid, Model model) {
        
        Product product = productService.getProductById(productid);
        productService.deleteProduct(productid);

        return "redirect:/list";
    }
}

	

