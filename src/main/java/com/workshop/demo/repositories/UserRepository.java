package com.workshop.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
