package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

import java.time.Month;
import java.time.Year;

public class Client2 extends ReadingClinet{

    private double base;
    private double taxableCharge;

    public Client2(Reading reading) {
        this.base = baseRate(reading.month(), reading.year()) * reading.quantity();
        this.taxableCharge = enrichReading(reading).taxableCharge();
    }

    public double getBase() {
        return base;
    }

    public double getTaxableCharge() {
        return taxableCharge;
    }
}
