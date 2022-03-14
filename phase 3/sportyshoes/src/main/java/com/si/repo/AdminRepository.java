package com.si.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,String>{
	
	public Admin findByEmail(String email);

}
