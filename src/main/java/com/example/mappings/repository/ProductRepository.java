package com.example.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mappings.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
