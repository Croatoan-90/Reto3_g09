package com.g09.reto3.service.impl;

import java.util.List;

import com.g09.reto3.entity.Reservation;
import com.g09.reto3.repository.ReservationRepository;
import com.g09.reto3.service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> findAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
