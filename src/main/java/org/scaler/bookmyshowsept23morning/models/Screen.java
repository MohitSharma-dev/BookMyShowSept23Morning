package org.scaler.bookmyshowsept23morning.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Screen extends BaseModel {
    private String name;
    private List<Seat> seats;
    private Theatre theatre;
    private List<Feature> features;
}
