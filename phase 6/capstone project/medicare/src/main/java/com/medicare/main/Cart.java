package com.medicare.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@ManyToOne(fetch =FetchType.EAGER)
	private Product product;
//	@OneToOne(fetch =FetchType.EAGER)
//	private User user;
	public Cart() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + "]";
	}
//	public User getUser() {
//		return user;
//	}

	

	
}
