package pl.sda.model;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString(callSuper = true)
public class Account {
    private int accountNumber;
    private LocalDateTime creatingDate;


    public Account (){
        this.accountNumber = (int) (Math.random()*10000000);
        this.creatingDate = LocalDateTime.now();
    }
}
