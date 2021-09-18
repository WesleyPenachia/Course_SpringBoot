package com.natymorgs.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natymorgs.Curso.Entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
