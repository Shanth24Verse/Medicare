package com.medicare.service;

import java.util.List;

import com.medicare.model.Cart;

public interface CartService {

	public Cart addToCart(Cart cart);
	
	public List<Cart> getAllByUserCart(long id);
	
	public void deleteCart(long id);
	
	public void updateCart(Cart cart,long cid);
}
