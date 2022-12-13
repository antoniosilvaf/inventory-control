package com.antoniosilva.inventorycontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniosilva.inventorycontrol.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
