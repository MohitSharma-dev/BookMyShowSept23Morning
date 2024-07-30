package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private int amount;
    private String refNumber;
    private Date paymentDate;

    @Enumerated
    private PaymentStatus status;
    @Enumerated
    private PaymentGateway paymentGateway;

    @Enumerated
    private PaymentMode paymentMode;

    @ManyToOne
    private Booking booking;
}
