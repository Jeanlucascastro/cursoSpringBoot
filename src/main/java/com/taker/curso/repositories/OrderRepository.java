package com.taker.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taker.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
	
}
