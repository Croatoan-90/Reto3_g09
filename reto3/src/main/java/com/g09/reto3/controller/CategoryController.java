package com.g09.reto3.controller;
import java.util.List;

import com.g09.reto3.service.CategoryService;
import com.g09.reto3.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/Category")

public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> findAllCategories(){
        return categoryService.findAllCategories();
    }

    @PostMapping("/save")
    public Category create(@RequestBody Category category){
        return categoryService.save(category);
    }
    
}