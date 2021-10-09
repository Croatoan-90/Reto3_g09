package com.g09.reto3.service;

import java.util.List;

import com.g09.reto3.entity.Clients;

public interface ClientsService {

    List<Clients> findAllClients();

    Clients save(Clients client);
    
}
