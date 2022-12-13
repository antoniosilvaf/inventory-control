package com.antoniosilva.inventorycontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniosilva.inventorycontrol.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
