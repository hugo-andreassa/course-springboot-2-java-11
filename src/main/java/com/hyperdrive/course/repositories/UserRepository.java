package com.hyperdrive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyperdrive.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
		
}
