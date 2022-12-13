package com.antoniosilva.inventorycontrol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoniosilva.inventorycontrol.model.Order;
import com.antoniosilva.inventorycontrol.repository.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

}
