package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.main.Cart;
import com.medicare.service.CartService;

@RestController
public class CartController  {
	@Autowired
	private CartService service;

@PostMapping("/cart")
@CrossOrigin(origins="http://localhost:4200")
	public Cart addCart(@RequestBody Cart cart) {
		return service.addCart(cart);
	}

@DeleteMapping("/cart/id/{id}")
@CrossOrigin(origins="http://localhost:4200")
	public void deleteCartById(@PathVariable Long id) {
		service.deleteCartById(id);
	}

@GetMapping("/carts")
@CrossOrigin(origins="http://localhost:4200")
	public List<Cart> getAllCart() {

		return service.getAllCart();
	}

}
