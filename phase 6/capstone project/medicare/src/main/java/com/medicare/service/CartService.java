package com.medicare.service;

import java.util.List;

import com.medicare.main.Cart;

public interface CartService {
	public Cart addCart(Cart cart);
	public void deleteCartById(Long id);
	public List<Cart> getAllCart();
}
