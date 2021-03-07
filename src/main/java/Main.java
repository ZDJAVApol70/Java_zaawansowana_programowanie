import pl.sda.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Amount amount1 = new Amount(new BigDecimal(1000000), Currency.PLN);
        Amount amount2 = new Amount(new BigDecimal(5000000), Currency.DOLLAR);
        BankAccount bankAccount1 = new BankAccount(amount1);
        BankAccount bankAccount2 = new BankAccount(amount2);
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(bankAccount1);
        accounts.add(bankAccount2);
        Address address1 = new Address("Lodz","Mickiewicza","50B");
        User user1 = new User("Paul",address1,accounts);
        System.out.println(user1.toString());
    }
}
