package com.antoniosilva.inventorycontrol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoniosilva.inventorycontrol.model.Category;
import com.antoniosilva.inventorycontrol.repository.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }
}
