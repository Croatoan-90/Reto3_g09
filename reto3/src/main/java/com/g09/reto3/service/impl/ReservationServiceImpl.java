package com.g09.reto3.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


import com.g09.reto3.entity.Reservation;
import com.g09.reto3.entity.custom.StatusAmount;
import com.g09.reto3.repository.ReservationCRepository;
import com.g09.reto3.repository.ReservationRepository;
import com.g09.reto3.service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl extends ReservationCRepository implements ReservationService {

    @Autowired
    ReservationRepository reservationRepository;
    
    @Autowired
    ReservationCRepository reservationCRepository;

    @Override
    public List<Reservation> findAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> findOne(Long id){
        return reservationRepository.findById(id);
    }

    public Optional<Reservation> getReservation(long id){
        return reservationRepository.findById(id);
    }

    @Override
    public Reservation save(Reservation reservation) {
        if(reservation.getIdReservation()==null){
          //  reservation.setStatus("created");
            return reservationRepository.save(reservation);
        }else{
            Optional<Reservation> paux=reservationRepository.findById(reservation.getIdReservation());
            if(paux.isEmpty()){
              //  reservation.setStatus("created");
                return reservationRepository.save(reservation);
            }else{
                return reservation;
            }
        }
    }

   

    @Override
    public boolean delete(Long id){
        Optional<Reservation> reservation=findOne(id);
            if(!reservation.isEmpty()){
                reservationRepository.delete(reservation.get());
                return true;        
            }
            return false;
        }
    /*public void delete(Long id){
        Optional<Reservation> reservation= findOne(id);
        if(reservation.isPresent()){
            reservationRepository.delete(reservation.get());
        }
    }*/

    @Override
    public Reservation update(Reservation reservation){
        if(reservation.getIdReservation()!=null){
        Optional<Reservation> rsv= reservationRepository.findById(reservation.getIdReservation());

            if(!rsv.isEmpty()){

                if(reservation.getStartDate()!=null){
                    rsv.get().setStartDate(reservation.getStartDate());
                }

                if(reservation.getDevolutionDate()!=null){
                    rsv.get().setDevolutionDate(reservation.getDevolutionDate());
                }

                if(reservation.getStatus()!=null){
                    rsv.get().setStatus(reservation.getStatus());
                }

                if(reservation.getScore()!=null){
                    rsv.get().setScore(reservation.getScore());
                }

                reservationRepository.save(rsv.get());
                return rsv.get();
                
            } else{
                return reservation;
            }
        }else{
            return reservation;
        }
     }


     public StatusAmount getStatusReport(){
         List<Reservation> completed=reservationCRepository.getReservationByStatus("completed");
         List<Reservation> cancelled=reservationCRepository.getReservationByStatus("cancelled");

         StatusAmount statAmount=new StatusAmount(completed.size(), cancelled.size());
         return statAmount;
     }
     
     public List<Reservation> getReservationPeriod(String date1, String date2){
         SimpleDateFormat parser=new SimpleDateFormat("yyy-MM-dd");
         Date dateOne=new Date();
         Date dateTwo=new Date();

         try{

            dateOne=parser.parse(date1);
            dateTwo=parser.parse(date2);
         }catch(ParseException exception){
             exception.printStackTrace();
         }

         if(dateOne.before(dateTwo)){
             return reservationCRepository.getReservationByPeriod(dateOne, dateTwo);
         }else{
             return new ArrayList<>();
         }

     }


}
