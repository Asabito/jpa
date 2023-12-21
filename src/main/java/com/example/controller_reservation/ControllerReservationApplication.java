package com.example.controller_reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration; //database

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) //database
public class ControllerReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerReservationApplication.class, args);
	}

}
