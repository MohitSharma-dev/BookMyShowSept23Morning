package org.scaler.bookmyshowsept23morning.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Movie extends BaseModel {
    private String title;
    private String director;
    private String year;
    private String genre;
    private List<String> actors;
    private List<Language> languages;
}
