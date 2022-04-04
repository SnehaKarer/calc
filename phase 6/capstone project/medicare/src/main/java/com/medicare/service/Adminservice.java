package com.medicare.service;

import java.util.List;

import com.medicare.main.Admin;
import com.medicare.main.User;

public interface Adminservice {
	public Admin addAdmin (Admin admin);
	public List<Admin> getAllAdmin();
	public Admin getAdminByName(String name);
	public Admin getAdminByPwd(String pwd);
	public Admin getAdminByNameAndPwd(String name,String pwd);
	public Admin addAdminlogin (Admin admin);
}
