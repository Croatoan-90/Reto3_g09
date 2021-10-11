package com.g09.reto3.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="reservation")
@Getter
@Setter
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq4")
    @Column(name="id")
    private Long idReservation;

    @Column(name="startDate")
    private Date startDate;

    @Column(name="devolutionDate")
    private Date devolutionDate;

    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name="skate")
    private Skates skate;

    @ManyToOne
    @JoinColumn(name="client")
    private Clients client;

    @Column(name="score")
    private String score;

  

    
}
