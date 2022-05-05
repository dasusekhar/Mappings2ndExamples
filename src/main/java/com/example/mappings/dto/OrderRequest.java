package com.example.mappings.dto;

import com.example.mappings.entity.Customer;

public class OrderRequest {
	
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public OrderRequest() {
		super();
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}
	
	

}
