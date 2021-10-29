package com.g09.reto3.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.g09.reto3.entity.Clients;
import com.g09.reto3.entity.Reservation;
import com.g09.reto3.entity.custom.CountClients;

import org.springframework.beans.factory.annotation.Autowired;



public class ReservationCRepository {

    @Autowired
    ReservationRepository reservationRepository;

    public List<Reservation> getReservationByStatus(String status){
        return reservationRepository.findAllByStatus(status);

    }

    public List<Reservation> getReservationByPeriod(Date dateOne, Date dateTwo){
        return reservationRepository.findAllByStartDateAfterAndStartDateBefore(dateOne, dateTwo);
    }


    public List<CountClients>  getTopClientes(){
        List<CountClients> countClients=new ArrayList<>();

        List<Object[]> report=reservationRepository.countTotalReservationByClient();
        for(int i=0; i<report.size();i++){
            countClients.add(new CountClients((Clients) report.get(i)[0], (Long) report.get(i)[1]));
        }

        return countClients;
    }

}
