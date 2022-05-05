package com.example.mappings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.mappings.dto.OrderResponse;
import com.example.mappings.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	@Query("SELECT  new com.example.mappings.dto.OrderResponse(c.name,p.productName) from Customer c JOIN c.products p")
	public List<OrderResponse>getJoinInfomation();

}
