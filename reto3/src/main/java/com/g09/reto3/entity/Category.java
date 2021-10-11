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
@Table(name="catergory")
@Getter
@Setter
@NoArgsConstructor

public class Category implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq1")
    @Column(name="id")
    private Long id;


    @Column(name="name")
    @NotNull
    private String name;

    @Column(name="description")
    @NotNull
    private String description;

    
}
