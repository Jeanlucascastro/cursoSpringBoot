package com.taker.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taker.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
	
}
