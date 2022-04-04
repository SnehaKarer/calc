package com.medicare.service;

import java.util.List;

import com.medicare.main.Purchase;

public interface Purchaseservice {
	public Purchase addPurchase(Purchase purchase);
	public Purchase getPurchaseById(long id);
	public List<Purchase> getItems();
	public Purchase  updatePurchase(Purchase purchase);
	public void deletePurchaseById(long id);
}
