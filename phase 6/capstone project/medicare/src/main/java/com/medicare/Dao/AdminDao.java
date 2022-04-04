package com.medicare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.main.Admin;
@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {

public Admin findByName(String name);
public Admin findByPwd(String pwd);
public Admin findByNameAndPwd(String name,String pwd);


}
