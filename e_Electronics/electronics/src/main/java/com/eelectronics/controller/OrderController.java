package com.eelectronics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eelectronics.model.Cart;
import com.eelectronics.model.Customer;
import com.eelectronics.model.CustomerOrder;
import com.eelectronics.service.CartService;
import com.eelectronics.service.CustomerOrderService;

@Controller
public class OrderController {

	@Autowired
    private CartService cartService;
	@Autowired
    private CustomerOrderService customerOrderService;

    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable("cartId") int cartId) {
        CustomerOrder customerOrder = new CustomerOrder();
        Cart cart=cartService.getCartById(cartId);
        customerOrder.setCart(cart);

        Customer customer = cart.getCustomer();
        customerOrder.setCustomer(customer);
        customerOrder.setBillingAddress(customer.getBillingaddress());
        customerOrder.setShippingAddressId(customer.getShippingaddress());

        customerOrderService.addCustomerOrder(customerOrder);

        return "redirect:/checkout?cartId="+cartId;
    }
}
