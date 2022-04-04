package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.main.Category;
import com.medicare.main.Product;
import com.medicare.service.Productservice;
@RestController
public class ProductController  {
@Autowired
private Productservice service;
@PostMapping("/product")
@CrossOrigin(origins="http://localhost:4200")
	public Product addProduct(@RequestBody Product product) {
		 
		return service.addProduct(product);
	}

@PutMapping("/product")
	public Product updateProuct(@RequestBody Product product) {
		
		return service.updateProuct(product);
	}

@GetMapping("/products")
@CrossOrigin(origins="http://localhost:4200")
	public List<Product> getAllProduct() {

		return service.getAllProduct();
	}
@GetMapping("/products/name/{name}")
	public Product getProductByName(@PathVariable String name) {
		
		return service.getProductByName(name);
	}
@DeleteMapping("/product/{id}")
	public void deleteProductById(@PathVariable long id) {
		service.deleteProductById(id);
		
	}



}
