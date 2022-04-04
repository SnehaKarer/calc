package com.medicare.controller;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.main.Purchase;
import com.medicare.service.Purchaseservice;

@RestController
public class Purchasecontroller
{
@Autowired
private Purchaseservice service;
@GetMapping("/purchase/id/{id}")
@CrossOrigin(origins="http://localhost:4200")
public Purchase getPurchaseById(@PathVariable long id) {
	
	return service.getPurchaseById(id);
}
@GetMapping("/purchases")
@CrossOrigin(origins="http://localhost:4200")
public List<Purchase> getItems() {
	
	return service.getItems();
}

@PutMapping("/purchase")
@CrossOrigin(origins="http://localhost:4200")
public Purchase updatePurchase(@RequestBody Purchase purchase) {
	
	return service.updatePurchase(purchase);
}

@DeleteMapping("/purchase/id/{id}")
@CrossOrigin(origins="http://localhost:4200")
public void deletePurchaseById(@PathVariable long id) {
	service.deletePurchaseById(id);
	
}
@PostMapping("/purchase")
@CrossOrigin(origins="http://localhost:4200")
public Purchase addPurchase(@RequestBody Purchase purchase) {
	
	return service.addPurchase(purchase);
}


}

