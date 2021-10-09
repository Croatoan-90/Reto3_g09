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
@Table(name="skates")
@Getter
@Setter
@NoArgsConstructor

public class Skates implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    @Column(name="skate_id")
    private long id;

    @Column(name="brand")
    @NotNull
    private String brand;

    @Column(name="model")
    @NotNull
    private int model;

    @Column(name="category_id")
    @NotNull
    private int category_id;

    @Column(name="skate_name")
    @NotNull
    private String skate_name;




    
}
