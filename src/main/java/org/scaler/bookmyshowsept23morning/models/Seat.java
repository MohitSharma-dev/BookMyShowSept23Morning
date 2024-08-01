package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String seatNumber;
    private int seatRow;
    private int seatCol;
    @OneToOne
    private SeatType seatType;

    @ManyToOne
    @JoinColumn(name = "screen_id", referencedColumnName = "id")
    private Screen screen;
}
