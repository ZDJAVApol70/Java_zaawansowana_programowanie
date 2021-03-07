package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class User extends Account {
    private String name;
    private Address address;
    private List<BankAccount> accounts;

}
