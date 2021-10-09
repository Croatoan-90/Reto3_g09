package com.g09.reto3.service;

import java.util.List;

import com.g09.reto3.entity.Message;

public interface MessageService {

    List<Message> findAllMessages();

    Message save(Message message);
    
}
