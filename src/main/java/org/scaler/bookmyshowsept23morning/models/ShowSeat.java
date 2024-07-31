package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated(value = EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}
