package com.medicare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.medicare.Dao.AdminDao;
import com.medicare.main.Admin;
import com.medicare.service.Adminservice;
@Service
public class Adminserviceimpl  implements Adminservice{
	@Autowired
	private AdminDao dao;
	@Override
	public Admin addAdmin(Admin admin) {
		
		return dao.save(admin);
	}

	@Override
	public List<Admin> getAllAdmin() {
		
		return dao.findAll();
	}

	@Override
	public Admin getAdminByName(String name) {
		
		return dao.findByName(name);
	}



	@Override
	public Admin getAdminByPwd(String pwd) {
		
		return dao.findByPwd(pwd);
	}

	@Override
	public Admin getAdminByNameAndPwd(String name, String pwd) {
		
		return dao.findByNameAndPwd(name, pwd);
	}

	@Override
	public Admin addAdminlogin(Admin admin) {
		
		return dao.save(admin);
	}


	

}
