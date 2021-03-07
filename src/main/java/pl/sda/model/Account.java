package pl.sda.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class Account {
    private int number;
    private LocalDate openingDate;

    public Account() {
        this.number = (int) (Math.random() * 1000000);
        this.openingDate = LocalDate.now();
    }
}
