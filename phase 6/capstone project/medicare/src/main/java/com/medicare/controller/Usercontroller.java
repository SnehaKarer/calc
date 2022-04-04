package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.main.User;
import com.medicare.service.Userservice;
@RestController
public class Usercontroller {
@Autowired
private Userservice service;

@PostMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
	public User addUser(@RequestBody User user) throws Exception {
	String name=user.getName();
	String password=user.getPwd();
	if(name!=null && !"".equals(name))
	{
		User userobj=service.getUserByName(name);
		if(userobj !=null)
		{
			throw new Exception("User with Name"+userobj+"is already exist");
		}
	}
	if(password!=null && !"".equals(password))
	{
		User userobj=service.getUserByPwd(password);
		if(userobj !=null)
		{
			throw new Exception("Pwd with User Name "+userobj+"is already exist");
		}
		
	}
	User userobj=null;
	userobj=service.addUser(user);
		return userobj;
	
	}
	@PostMapping("/user/login")
	@CrossOrigin(origins="http://localhost:4200")
	public User addUserLogin(@RequestBody User user) throws Exception {
	String emailid=user.getEmailid();
	String pwd=user.getPwd();
	User userobj=null;
	if(emailid!=null && pwd!=null)
	{
		userobj=service.getUserByEmailidAndPwd(emailid, pwd);
	}
	if(userobj==null)
	{
		throw new Exception("Bad credentials ");
	}
		return userobj;
	}

	@GetMapping("/users")
	public List<User> getAllUser() {
		
		return service.getAllUser();
	}

	@GetMapping("/user/name/{name}")
	public User getUserByName(@PathVariable String name) {
		
		return service.getUserByName(name);
	}

	@GetMapping("/user/pwd/{pwd}")
	public User getUserByPwd(@PathVariable String pwd) {
		
		return service.getUserByPwd(pwd);
	}


	@GetMapping("/user/emainid/{emainid}")
	public User getUserByEmail(@PathVariable String emailid) {
	
		return service.getUserByEmail(emailid);
	}
	@GetMapping("/user/emailid/{emailid}/pwd/{pwd}")
	public User getUserByEmailidAndPwd(@PathVariable String emailid,@PathVariable String pwd) {
		
		return service.getUserByEmailidAndPwd(emailid, pwd);
	}






}
