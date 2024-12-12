package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {

    @OneToMany
    private List<ShowSeat> showSeats;
    private int amount;
    // Booking 1 : M Payments
    @OneToMany
    private List<Payment> payments;
    // Booking M : 1 User
    @ManyToOne
    private User bookedBy;
    private Date bookingDate;

    @Enumerated
    private BookingStatus bookingStatus;
}

// HW : Please complete all the cardinalities before the next session

// mysqlBookMyShowSept23Morning