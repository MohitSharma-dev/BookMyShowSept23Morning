package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;

    // Screen 1:M Seats
    @OneToMany
    private List<Seat> seats;

    // Screen M:1 Theatre
    @ManyToOne
    private Theatre theatre;

    private List<Feature> features;
}
