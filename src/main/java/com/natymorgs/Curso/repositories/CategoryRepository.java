package com.natymorgs.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natymorgs.Curso.Entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
