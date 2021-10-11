package com.g09.reto3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.sun.istack.NotNull;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
//import java.util.List;

@Entity
@Table(name="skates")
@Getter
@Setter
@NoArgsConstructor

public class Skates implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq5")
    @Column(name="id")
    private Long id;

    @Column(name="name")
    @NotNull
    private String name;

    @Column(name="brand")
    @NotNull
    private String brand;

    @Column(name="year")
    @NotNull
    private int year;

    @Column(name="description")
    @NotNull
    private String description;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
        
    
    @ManyToOne
    @JoinColumn(name="message")
    private Message message;

    
}
