package com.medicare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.main.User;
@Repository
public interface UserDao extends JpaRepository<User, Long>{
	
	
	
	public User findByName(String name);
	public User findByPwd(String pwd);
	public User findByEmailid(String emailid);
	public User findByEmailidAndPwd(String emailid,String pwd);
}
