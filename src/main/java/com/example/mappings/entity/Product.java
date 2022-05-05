package com.example.mappings.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
	@Id
	private int prouductId;
	
	private String productName;
	
	private double price;
	public int getProuductId() {
		return prouductId;
	}
	public void setProuductId(int prouductId) {
		this.prouductId = prouductId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int prouductId, String productName, double price) {
		super();
		this.prouductId = prouductId;
		this.productName = productName;
		this.price = price;
	}
	public Product() {
		super();
	}
	
	

}
