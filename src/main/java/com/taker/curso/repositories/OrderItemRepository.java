package com.taker.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taker.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
	
}
