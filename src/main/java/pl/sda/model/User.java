package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Supplier;

@Data
@AllArgsConstructor
@ToString(callSuper = true)
public class User extends Account{
    private String name;
    private Address address;
    private List<BankAccount> accounts;

    public BigDecimal sumAmount() {
        BigDecimal sum = accounts.stream()
                // getting a stream of values
                .map(bankAccount -> {
                    Amount amount = bankAccount.getAmount();
                    BigDecimal amountInPln = amount.getValue().multiply(BigDecimal.valueOf(amount.getCurrency().getExchangeRate()));
                    return amountInPln;
                })
                // adding the values of the stream
                .reduce((bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2))
                // returning the above sum or 0 if it doesn't exist
                .orElse(BigDecimal.ZERO);
       return sum;
    }
}
