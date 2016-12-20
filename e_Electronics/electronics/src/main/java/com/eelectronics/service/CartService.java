package com.eelectronics.service;

import com.eelectronics.model.Cart;
import com.eelectronics.model.CartItem;

public interface CartService {
void addCart(CartItem cartItem);
void removeCart(CartItem cartItem);
void removeAllCart(CartItem cartItem);
Cart getCartById(int cartId);

}
