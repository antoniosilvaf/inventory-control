package com.antoniosilva.inventorycontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniosilva.inventorycontrol.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
    
}
