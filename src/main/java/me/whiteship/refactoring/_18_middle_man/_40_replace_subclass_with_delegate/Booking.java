package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

import org.springframework.cglib.core.Local;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Booking {

    protected Show show;

    protected LocalDateTime time;

    protected PremiumDelegate premiumDelegate;

    public Booking(Show show, LocalDateTime time) {
        this.show = show;
        this.time = time;
    }

    public static Booking createBook(Show show, LocalDateTime time){
        return new Booking(show,time);

    }
    public static Booking createPremiumBook(Show show, LocalDateTime time, PremiumExtra extra){
        Booking booking =new Booking(show,time);
        booking.premiumDelegate = new PremiumDelegate(booking,extra);
        return booking;


    }

    public boolean hasTalkback() {
        return  (this.premiumDelegate !=null)? this.premiumDelegate.hasTalkback() :
                this.show.hasOwnProperty("talkback") && !this.isPeakDay();
    }

    protected boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public double basePrice() {
        double result = this.show.getPrice();
        if (this.isPeakDay()) result += Math.round(result * 0.15);
        return (this.premiumDelegate !=null) ? this.premiumDelegate.extendsBasePrice(result) : result;

    }


    public boolean hasDinner() {
        return (this.premiumDelegate !=null) && this.premiumDelegate.hasDinner();
    }


}
