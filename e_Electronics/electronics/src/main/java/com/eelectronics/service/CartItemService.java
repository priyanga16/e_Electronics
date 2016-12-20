package com.eelectronics.service;

import com.eelectronics.model.Cart;
import com.eelectronics.model.CartItem;

public interface CartItemService {
	void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);
}
