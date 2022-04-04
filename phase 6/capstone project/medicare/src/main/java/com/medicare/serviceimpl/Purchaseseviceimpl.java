package com.medicare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.Dao.PurchaseDao;
import com.medicare.main.Purchase;
import com.medicare.service.Purchaseservice;
@Service
public class Purchaseseviceimpl implements Purchaseservice {
	@Autowired
	private PurchaseDao dao;


	@Override
	public List<Purchase> getItems() {
		
		return dao.findAll();
	}

	@Override
	public Purchase updatePurchase(Purchase purchase) {
		
		return dao.save(purchase);
	}

	@Override
	public void deletePurchaseById(long id) {
		dao.deleteById(id);
		
	}

	@Override
	public Purchase getPurchaseById(long id) {
		
		return dao.getPurchaseById(id);
	}

	@Override
	public Purchase addPurchase(Purchase purchase) {
		
		return dao.save(purchase);
	}





}
