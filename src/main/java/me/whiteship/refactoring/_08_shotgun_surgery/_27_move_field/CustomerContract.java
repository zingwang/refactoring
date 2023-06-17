package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import java.time.LocalDate;

public class CustomerContract {

    private LocalDate startDate;

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    private double discountRate;
    public CustomerContract(LocalDate startDate, double discountRate) {
        this.startDate = startDate;
        this.discountRate = discountRate;
    }
}
