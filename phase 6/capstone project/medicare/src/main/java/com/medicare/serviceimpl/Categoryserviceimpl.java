package com.medicare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.Dao.CategoryDao;
import com.medicare.main.Category;
import com.medicare.service.Categoryservice;
@Service
public class Categoryserviceimpl implements Categoryservice{
@Autowired
private CategoryDao dao;
	@Override
	public Category addCategory(Category category) {
		
		return dao.save(category);
	}

	@Override
	public List<Category> getAllCategory() {

		return dao.findAll();
	}


	@Override
	public Category updateCategory(Category category) {
		
		return dao.save(category);
	}

	@Override
	public Category getCategoryByName(String name) {
		
		return dao.findByName(name);
	}

}
