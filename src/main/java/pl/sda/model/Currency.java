package pl.sda.model;

import lombok.Getter;

@Getter
public enum Currency {
    PLN(1.0),
    EURO(4.5),
    DOLLAR(4.2);

    private double exchangeRate;

    Currency(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
