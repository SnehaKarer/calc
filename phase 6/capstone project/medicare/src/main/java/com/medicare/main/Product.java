package com.medicare.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private  long id;
@Column(name="name")
private String name;
@Column(name="price")
private int price;
@Lob
@Column(columnDefinition = "MEDIUMBLOB")

private String Avatar;
@Column(name="Quantity")
private int quantity;
@ManyToOne(fetch = FetchType.EAGER)
private Category category;
//public Category getCategory() {
//	return category;
//}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String name, int price, String avatar, int quantity) {
	super();
	this.name = name;
	this.price = price;
	Avatar = avatar;
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", Avatar=" + Avatar + ", Quantity=" + quantity
			+ "]";
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getAvatar() {
	return Avatar;
}
public void setAvatar(String avatar) {
	Avatar = avatar;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


//public void setCategory(Category category) {
//	this.category = category;
//}




	
}
