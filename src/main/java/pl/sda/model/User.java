package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@AllArgsConstructor
@ToString(callSuper = true)
public class User {
    private String name;
    private Address address;
    private List<BankAccount> accounts;


}
