package com.g09.reto3.service.impl;

import java.util.List;

import com.g09.reto3.entity.Category;
import com.g09.reto3.repository.CategoryRepository;
import com.g09.reto3.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
    
}
