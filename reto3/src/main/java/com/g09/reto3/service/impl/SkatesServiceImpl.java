package com.g09.reto3.service.impl;

import java.util.List;

import com.g09.reto3.entity.Skates;
import com.g09.reto3.repository.SkatesRepository;
import com.g09.reto3.service.SkatesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkatesServiceImpl implements SkatesService{

    @Autowired

    SkatesRepository skatesRepository;

    @Override
    public List<Skates> findAllSkates() {
        return (List<Skates>) skatesRepository.findAll();
    }

    @Override
    public Skates save(Skates skate) {
        return skatesRepository.save(skate);
    }
    
}
