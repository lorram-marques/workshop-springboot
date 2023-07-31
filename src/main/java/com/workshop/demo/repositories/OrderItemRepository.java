package com.workshop.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
