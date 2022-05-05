package com.example.mappings.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mappings.dto.OrderRequest;
import com.example.mappings.dto.OrderResponse;
import com.example.mappings.entity.Customer;
import com.example.mappings.repository.CustomerRepository;
import com.example.mappings.repository.ProductRepository;

@RestController
public class OrderController {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;
	
	
	
	@PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
       return customerRepository.save(request.getCustomer());
    }
	
	@GetMapping("/findAllOrders")
public List<Customer> findAllOrders()
{
	return customerRepository.findAll();
}
	@GetMapping("/info")
	public List<OrderResponse> getJoinInformation()
	{
		return customerRepository.getJoinInfomation();
	}

}
