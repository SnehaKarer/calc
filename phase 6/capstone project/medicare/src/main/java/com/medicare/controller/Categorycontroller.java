package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.main.Category;
import com.medicare.service.Categoryservice;

@RestController
public class Categorycontroller{
@Autowired
private Categoryservice service;
	@PostMapping("/category")
	@CrossOrigin(origins="http://localhost:4200")
	public Category addCategory(@RequestBody Category category) {
		try
		{
		return service.addCategory(category);
		}
		catch(Exception ex){
	ex.printStackTrace();
		}
		return category;
		}

	@GetMapping("/category")
	public List<Category> getAllCategory() {
		
		return service.getAllCategory();
	}

	@GetMapping("/category/{name}")
	public Category getCategoryByName(@PathVariable String name) {
		
		return service.getCategoryByName(name);
	}

@PutMapping("/category/category/{category}")
	public Category updateCategory(@RequestBody Category category) {
		
		return service.updateCategory(category);
	}

}
