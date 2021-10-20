package com.g09.reto3.service.impl;

import java.util.List;
import java.util.Optional;

import com.g09.reto3.entity.Clients;
import com.g09.reto3.repository.ClientsRepository;
import com.g09.reto3.service.ClientsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientsServiceImpl implements ClientsService {

    @Autowired
    ClientsRepository clientsRepository;

    @Override
    public List<Clients> findAllClients() {
                return (List<Clients>) clientsRepository.findAll();
    }

    @Override
    public Optional<Clients> findOne(Long id){
        return clientsRepository.findById(id);
    }

    @Override
    @Transactional
    public Clients save(Clients client) {
        
        return clientsRepository.save(client);
    }

    @Override
    public void delete(Long id){
        Optional<Clients> client= findOne(id);
        if(client.isPresent()){
            clientsRepository.delete(client.get());
        }
    }

    


    
}
