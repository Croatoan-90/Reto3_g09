package com.g09.reto3.service.impl;

import java.util.List;

import com.g09.reto3.entity.Clients;
import com.g09.reto3.repository.ClientsRepository;
import com.g09.reto3.service.ClientsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ClientsServiceImpl implements ClientsService {

    @Autowired
    ClientsRepository clientsRepository;

    @Override
    public List<Clients> findAllClients() {
                return (List<Clients>) clientsRepository.findAll();
    }

    @Override
    @Transactional
    public Clients save(Clients client) {
        
        return clientsRepository.save(client);
    }

  

    


    
}
