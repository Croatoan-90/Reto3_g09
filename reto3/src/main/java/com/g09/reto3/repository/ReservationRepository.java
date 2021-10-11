package com.g09.reto3.repository;
import com.g09.reto3.entity.Reservation;

import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long>{
    

}
