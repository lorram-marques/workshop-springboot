package com.workshop.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
