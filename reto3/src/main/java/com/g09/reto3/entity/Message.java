package com.g09.reto3.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.sun.istack.NotNull;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name="message")
@Getter
@Setter
@NoArgsConstructor


public class Message implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq3")
    @Column(name="id")
    private Long idMessage;

    @Column(name="messageText")
    @NotNull
    private String messageText;
    
   /* @ManyToOne
    @JoinColumn(name="client")
    private Clients client;

    @ManyToOne
    @JoinColumn(name="skate")
    private Skates skate;*/
}
