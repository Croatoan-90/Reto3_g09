package com.g09.reto3.repository;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.g09.reto3.entity.Reservation;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long>{
    
    Optional<Reservation> findById(Long id);

    List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);

    public List<Reservation> findAllByStatus(String status);

    @Query("select c.client, COUNT (c.client) from Reservation AS c group by c.client order by COUNT(c.client) desc")
    public List<Object[]> countTotalReservationByClient();

}
