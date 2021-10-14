package com.g09.reto3.controller;


import java.util.List;

import com.g09.reto3.entity.Message;
import com.g09.reto3.service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@CrossOrigin(origins="*")
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/all")
    public List<Message> findAllMessages(){
        return messageService.findAllMessages();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    public Message create(@RequestBody Message message){
        return messageService.save(message);
    }
    
}
