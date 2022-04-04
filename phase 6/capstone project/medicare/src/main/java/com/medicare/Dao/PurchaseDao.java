package com.medicare.Dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.main.Purchase;
@Repository
public interface PurchaseDao  extends JpaRepository<Purchase, Long>{
	
public Purchase getPurchaseById(long id);
}
