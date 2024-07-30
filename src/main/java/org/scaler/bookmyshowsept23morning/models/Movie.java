package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionType;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String title;
    private String director;
    private String year;
    private String genre;

    @ElementCollection
    private List<String> actors;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Language> languages;
}
