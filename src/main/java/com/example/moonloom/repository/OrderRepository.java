package com.example.moonloom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.moonloom.model.Order; // ✅ Import the entity class

public interface OrderRepository extends JpaRepository<Order, Long> {
}
