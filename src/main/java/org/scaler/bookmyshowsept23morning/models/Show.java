package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    // N:1
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private int duration;

    // N : 1
    @ManyToOne
    private Screen screen;

    // 1 : N
    @OneToMany
    private List<ShowSeat> showSeats;

    // N : N
    @ManyToMany
    private List<ShowSeatType> showSeatTypes;
}
