package com.example.controller_reservation.repository;

import com.example.controller_reservation.model.Reservation;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
