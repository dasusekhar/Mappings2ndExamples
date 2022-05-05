package com.example.mappings.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {
	
	private String name;
	private String productName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public OrderResponse(String name, String productName) {
		super();
		this.name = name;
		this.productName = productName;
	}
	public OrderResponse() {
		super();
	}
	
	@Override
	public String toString() {
		return "OrderResponse [name=" + name + ", productName=" + productName + "]";
	}
	

}
