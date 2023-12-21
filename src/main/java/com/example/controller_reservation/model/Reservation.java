package com.example.controller_reservation.model;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name="reservation_table")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "local_date_time")
    private LocalDateTime reservationTime;

    public Reservation(){
    }

    public Reservation(Long id, String customerName, LocalDateTime reservationTime){
        this.id = id;
        this.customerName = customerName;
        this.reservationTime = reservationTime;
    }

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public LocalDateTime getReservationTime(){
        return this.reservationTime;
    }
    public void setReservationTime(LocalDateTime reservationTime){
        this.reservationTime = reservationTime;
    }

    @Override
    public String toString(){
        return "Reservation{"+
                "id="+id+
                ", customerName='"+customerName+'\''+
                ", reservationTime="+reservationTime+
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Reservation)) return false;
        Reservation that = (Reservation) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode(){
        return getId().hashCode();
    }
}
