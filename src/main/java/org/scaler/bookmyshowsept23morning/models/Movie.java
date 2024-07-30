package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String title;
    private String director;
    private String year;
    private String genre;
    private List<String> actors;
    private List<Language> languages;
}
