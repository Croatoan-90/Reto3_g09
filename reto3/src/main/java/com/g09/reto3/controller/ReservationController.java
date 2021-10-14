package com.g09.reto3.controller;

import java.util.List;

import com.g09.reto3.entity.Reservation;
import com.g09.reto3.service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    
    ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> findAllReservations(){
        return reservationService.findAllReservations();
    }

    @PostMapping("/save")
    public Reservation create(@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }
    

}
