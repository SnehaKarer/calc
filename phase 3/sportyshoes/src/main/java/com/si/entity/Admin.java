package com.si.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="aId", nullable=false, updatable=false)
	private int aId;
	@Column(name="aEmail")
	private String email;
	@Column(name="aPassword")
	private String password;
	
	public Admin() {
		super();
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", email=" + email + ", password=" + password + "]";
	}

	public Admin(int aId, String email, String password) {
		super();
		this.aId = aId;
		this.email = email;
		this.password = password;
	}
	
	}
	
	


