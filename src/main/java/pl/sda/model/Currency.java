package pl.sda.model;

import lombok.Getter;

@Getter
public enum Currency {
    PLN(1.0),
    EURO(4.33),
    DOLLAR(4.12);

    private double exchangeRate;

    Currency(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
