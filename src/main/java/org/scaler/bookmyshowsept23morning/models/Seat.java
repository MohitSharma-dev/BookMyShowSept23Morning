package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String seatNumber;
    private int row;
    private int col;
    @OneToOne
    private SeatType seatType;
    @OneToOne
    private Screen screen;
}
