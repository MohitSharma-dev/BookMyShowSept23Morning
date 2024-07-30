package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {

    // N : 1
    @ManyToOne
    private Show show;

    @OneToOne
    private Seat seat;


    private ShowSeatStatus showSeatStatus;
}
