package com.medicare.main;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.CascadeType;
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
@Table(name="Purchase")
public class Purchase {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY )
@Column(name="id")
private long id;
@Column(name = "date")
private Date date;
@Column(name = "gross_total")
private BigDecimal total;
@ManyToOne(fetch = FetchType.EAGER)
private User user;
@ManyToOne(fetch = FetchType.EAGER) //many to many
private Product product;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public BigDecimal getTotal() {
	return total;
}
public void setTotal(BigDecimal total) {
	this.total = total;
}
public Purchase() {
	super();
	
}
public Purchase(Date date, BigDecimal total) {
	super();
	this.date = date;
	this.total = total;
}
@Override
public String toString() {
	return "Purchase [id=" + id + ", date=" + date + ", total=" + total + "]";
}
public User getUser() {
	return user;
}
public Product getProduct() {
	return product;
}


}
