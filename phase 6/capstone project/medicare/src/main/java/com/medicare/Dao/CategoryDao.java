package com.medicare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.main.Category;
@Repository
public interface CategoryDao extends JpaRepository<Category, Long>{
	public Category findByName(String name);
}
