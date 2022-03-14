package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.entity.Admin;
import com.si.repo.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repository;
	
	 public Admin addAdmin(Admin admin) {
	        return repository.save(admin);
	    }
	
	public List<Admin> getAllAdmin() {
		return repository.findAll();
	}
		
	public Admin updateAdmin(Admin admin)
	{ 
		Admin existAdmin = repository.findByEmail(admin.getEmail());
		existAdmin.setEmail(admin.getEmail());
		existAdmin.setPassword(admin.getPassword());
		return repository.save(existAdmin);
	}

	
	}
	


