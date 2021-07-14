package com.taker.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taker.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
	
}
