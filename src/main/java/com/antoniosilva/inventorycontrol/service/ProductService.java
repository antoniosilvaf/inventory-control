package com.antoniosilva.inventorycontrol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoniosilva.inventorycontrol.model.Product;
import com.antoniosilva.inventorycontrol.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }
}
