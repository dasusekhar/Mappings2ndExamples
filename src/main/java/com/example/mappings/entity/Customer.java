package com.example.mappings.entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity

public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private double mobile;
	
	
	@OneToMany( targetEntity=Product.class ,cascade= CascadeType.ALL)
	@JoinColumn(name ="cp_fk",referencedColumnName = "id")
	private List<Product> products;
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getMobile() {
			return mobile;
		}
		public void setPrice(double price) {
			this.mobile = mobile;
		}
	
	public Customer(int id, String name, double mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	public Customer() {
		super();
	}
	
	

}
