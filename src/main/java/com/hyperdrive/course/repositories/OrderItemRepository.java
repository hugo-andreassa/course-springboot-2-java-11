package com.hyperdrive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyperdrive.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
