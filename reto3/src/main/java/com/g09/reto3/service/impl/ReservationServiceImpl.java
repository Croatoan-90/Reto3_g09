package com.g09.reto3.service.impl;

import java.util.List;
import java.util.Optional;

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

    public Optional<Reservation> getReservation(long id){
        return reservationRepository.findById(id);
    }

    @Override
    public Reservation save(Reservation reservation) {
        if(reservation.getIdReservation()==null){
            reservation.setStatus("created");
            return reservationRepository.save(reservation);
        }else{
            Optional<Reservation> paux=reservationRepository.findById(reservation.getIdReservation());
            if(paux.isEmpty()){
                reservation.setStatus("created");
                return reservationRepository.save(reservation);
            }else{
                return reservation;
            }
        }
    }
}
