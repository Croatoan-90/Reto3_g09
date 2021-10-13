package com.g09.reto3.controller;

import java.util.List;

import com.g09.reto3.service.SkatesService;
import com.g09.reto3.entity.Skates;
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
@RequestMapping("/api/Skate")
public class SkatesController {
    
    @Autowired
    SkatesService skatesService;

    @GetMapping("/all")
    public List<Skates> findAllSkates(){
        return skatesService.findAllSkates();
    }

    @PostMapping("/save")
    public Skates create(@RequestBody Skates skate){
        return skatesService.save(skate);
    }

  



}