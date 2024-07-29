package org.scaler.bookmyshowsept23morning;

import org.scaler.bookmyshowsept23morning.models.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookmyshowSept23MorningApplication {

    public static void main(String[] args) {
        BaseModel b = new BaseModel();
        b.setId(5);
        SpringApplication.run(BookmyshowSept23MorningApplication.class, args);
    }

}
