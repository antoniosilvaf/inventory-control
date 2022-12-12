package com.antoniosilva.inventorycontrol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoniosilva.inventorycontrol.model.User;
import com.antoniosilva.inventorycontrol.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
