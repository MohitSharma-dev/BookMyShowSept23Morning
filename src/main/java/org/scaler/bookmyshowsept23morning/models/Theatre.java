package org.scaler.bookmyshowsept23morning.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Theatre extends BaseModel{
    private String name;
    private String address;
//    private List<Screen> screens;
    private Region region;
}

// Region 1 : M Theatre : region_id in theatre table
// select * from theatre where regin_id = 5;
// findByRegion (Region )
// Based on the show , screen is automatically selected : Admin must have informed
