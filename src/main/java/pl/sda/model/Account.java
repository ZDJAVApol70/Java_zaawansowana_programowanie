package pl.sda.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Account {
    private int number;
    private LocalDate OpeningDate;

    public Account() {
        this.number = (int) (Math.random()*1000);
        this.OpeningDate = LocalDate.now();
    }
}
