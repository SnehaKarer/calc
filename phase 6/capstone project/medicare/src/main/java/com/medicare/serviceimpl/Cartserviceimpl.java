package com.medicare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.Dao.CartDao;
import com.medicare.main.Cart;
import com.medicare.service.CartService;

@Service
public class Cartserviceimpl implements CartService{
@Autowired
private  CartDao dao;

@Override
public Cart addCart(Cart cart) {
	
	return dao.save(cart);
}

@Override
public void deleteCartById(Long id) {
 dao.deleteById(id);
	
}

@Override
public List<Cart> getAllCart() {
	
	return dao.findAll();
}
}
