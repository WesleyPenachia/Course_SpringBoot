package com.natymorgs.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natymorgs.Curso.Entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
