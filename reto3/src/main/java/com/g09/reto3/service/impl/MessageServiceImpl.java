package com.g09.reto3.service.impl;

import java.util.List;

import com.g09.reto3.entity.Message;
import com.g09.reto3.repository.MessageRepository;
import com.g09.reto3.service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    MessageRepository messageRepository;

    @Override
    public List<Message> findAllMessages() {
        return (List<Message>) messageRepository.findAll();
    }

    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }
    
}
