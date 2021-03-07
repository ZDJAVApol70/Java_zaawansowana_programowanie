package pl.sda.model;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> bankAccounts= new ArrayList<>();
        BankAccount bankAccount1 = new BankAccount(BigDecimal.valueOf(222222), Currency.PLN);
        BankAccount bankAccount2 = new BankAccount(BigDecimal.valueOf(111111), Currency.PLN);
        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);

        User user1 = new User("Pawel", new Address("London", "Necessery", "123"), bankAccounts);

        System.out.println(user1.toString());
    }
}
