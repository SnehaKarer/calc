package com.medicare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.main.Cart;
@Repository
public interface CartDao extends JpaRepository<Cart, Long> {
	
	

}
