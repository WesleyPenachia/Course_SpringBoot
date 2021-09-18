package com.natymorgs.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natymorgs.Curso.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
