package com.g09.reto3.service;

import java.util.List;

import com.g09.reto3.entity.Category;

public interface CategoryService {

    List<Category> findAllCategories();

    Category save(Category category);
    
}
