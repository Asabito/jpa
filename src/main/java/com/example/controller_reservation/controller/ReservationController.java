package com.example.controller_reservation.controller;

import com.example.controller_reservation.model.Reservation;
import com.example.controller_reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;



import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation){
        return reservationService.createReservation(reservation);
    }
//
//    @GetMapping
//    public List<Reservation> getAllReservations(){
//        return reservationService.getAllReservations();
//    }
//
//    @GetMapping("/{id}")
//    public Reservation getReservationById(@PathVariable Long id){
//        return reservationService.getReservationById(id).orElse(null);
//    }
//
//    @GetMapping("/api")
//    @ResponseBody
//    public List<Reservation> getReservationByName(@RequestParam(required = false) String name){
//        return reservationService.getReservationByName(name);
//    }
}
