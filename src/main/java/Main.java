import pl.sda.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Amount amount1 = new Amount(new BigDecimal(10000000), Currency.PLN);
        Amount amount2 = new Amount(new BigDecimal(2000000), Currency.DOLLAR);
        BankAccount bankAccount1 = new BankAccount(amount1);
        BankAccount bankAccount2 = new BankAccount(amount2);
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(bankAccount1);
        accounts.add(bankAccount2);
        Address address1 = new Address("Lodz", "Wlokniarzy", "221A");
        User user1 = new User("Johnny", address1,accounts);
        System.out.println(user1.toString());
    }
}
