package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


public class AdminUser extends User  {

    public AdminUser(String name, Address address, List<BankAccount> accounts) {
        super(name, address, accounts);
    }
    public void deleteAccount (Account account) {
        account.setDeleted(true);
    }
}
