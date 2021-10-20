package com.g09.reto3.service.impl;

import java.util.List;
import java.util.Optional;

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
    public Optional<Skates> findOne(Long id){
        return skatesRepository.findById(id);
    }

    @Override
    public Skates save(Skates skate) {
        return skatesRepository.save(skate);
    }

    @Override
    public void delete(Long id){
        Optional<Skates> skate= findOne(id);
        if(skate.isPresent()){
            skatesRepository.delete(skate.get());
        }
    }
    
}
