package com.g09.reto3.service;

import java.util.List;

import com.g09.reto3.entity.Reservation;

public interface ReservationService {

    List<Reservation> findAllReservations();

   Reservation save(Reservation reservation);
    
    
}
