package com.medicare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.Dao.ProductDao;
import com.medicare.main.Category;
import com.medicare.main.Product;
import com.medicare.service.Productservice;

@Service
public class Productserviceimpl implements Productservice{
@Autowired
private ProductDao dao;

@Override
public Product addProduct(Product product ) {
//	Category category=new Category();
//	category.setId(6);
//	category.setName("string");
//	product.setCategory(category);
	return dao.save(product);
	
}

@Override
public Product updateProuct(Product product) {
	
	return dao.save(product);
}

@Override
public List<Product> getAllProduct() {
	
	return dao.findAll();
}



@Override
public Product getProductByName(String name) {
	
	return dao.getProductByName(name);
}

@Override
public void deleteProductById(long id) {

	dao.deleteById(id);
}


	
}
