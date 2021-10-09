package com.g09.reto3.service;

import java.util.List;

import com.g09.reto3.entity.Skates;

public interface SkatesService {

    List<Skates> findAllSkates();

    Skates save(Skates skate);
    
}
