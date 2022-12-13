package com.antoniosilva.inventorycontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniosilva.inventorycontrol.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
