package com.workshop.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
