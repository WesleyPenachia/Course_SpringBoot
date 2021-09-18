package com.natymorgs.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natymorgs.Curso.Entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
