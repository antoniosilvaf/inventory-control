package com.antoniosilva.inventorycontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniosilva.inventorycontrol.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
