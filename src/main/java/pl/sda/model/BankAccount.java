package pl.sda.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString(callSuper = true)
public class BankAccount extends Account{
    private Amount amount;
}
