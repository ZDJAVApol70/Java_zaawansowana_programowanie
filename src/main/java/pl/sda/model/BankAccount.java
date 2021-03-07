package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@ToString(callSuper = true)

public class BankAccount extends Account {
    private BigDecimal value;
    private Currency currency;


}
