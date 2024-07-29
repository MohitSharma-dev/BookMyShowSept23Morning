package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@MappedSuperclass
public class BaseModel {
    @Id
    private int id;
    private Date createdAt;
    private Date lastModifiedAt;
}

// corresponding tables will be created which will persist the data

// get the data from the client
// Do certain business logic : creating certain objects
// interact with db : mysql

// ORM : Object Relation Mapping
// Hibernate : Focus on the implementation of certain methods which internally uses SQL queries
// and get your work done

// Spring Data JPA


// PhonePe : YesBank
// SB : Hibernate


// PhonePe -> BankAPI <- YesBank
// SB -> Spring Data JPA <- Hibernate


// Map all the required classes to @Entity
