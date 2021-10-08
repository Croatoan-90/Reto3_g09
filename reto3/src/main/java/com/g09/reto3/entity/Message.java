package com.g09.reto3.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name="messages")
@Getter
@Setter
@NoArgsConstructor


public class Message implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    @Column(name="id")
    private long id;

    @Column(name="messagetext")
    @NotNull
    private String messagetext;
    
    
}
