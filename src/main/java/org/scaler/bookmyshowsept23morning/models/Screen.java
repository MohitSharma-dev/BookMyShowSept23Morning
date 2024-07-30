package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;
//    private List<Seat> seats;
    @ManyToOne
    private Theatre theatre;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
