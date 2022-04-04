package com.medicare.service;

import java.util.List;

import com.medicare.main.Category;
import com.medicare.main.Product;

public interface Productservice {
	
	public Product addProduct(Product product);
	public Product updateProuct(Product product);
	
	public List<Product> getAllProduct();
	public void deleteProductById(long id);
	public Product getProductByName(String name);
	

}
