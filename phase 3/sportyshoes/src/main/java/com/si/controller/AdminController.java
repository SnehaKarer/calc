package com.si.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.entity.Admin;

import com.si.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService service;
	
	 @PostMapping("/")
	    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin)
	    {
	      Admin obj = service.addAdmin(admin);
	        if(obj!=null)
	            return new ResponseEntity<Admin>(obj,HttpStatus.CREATED);
	        else
	            return new ResponseEntity<Admin>(obj,HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	
	@GetMapping("/admins")
	public List<Admin> getAll()
	{
		return service.getAllAdmin();
	}
	
	@PutMapping("/updateAdmin")
	public Admin updateAdmin(@RequestBody Admin admin)
	{
		return service.updateAdmin(admin);
	}
}