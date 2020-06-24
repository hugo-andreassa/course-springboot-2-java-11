package com.hyperdrive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyperdrive.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
