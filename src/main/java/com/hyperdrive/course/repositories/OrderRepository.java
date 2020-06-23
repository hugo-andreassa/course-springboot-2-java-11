package com.hyperdrive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyperdrive.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {	
		
}
