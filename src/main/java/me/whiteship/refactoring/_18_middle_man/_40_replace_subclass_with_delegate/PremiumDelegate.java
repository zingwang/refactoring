package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

public class PremiumDelegate {

    public PremiumDelegate(Booking host, PremiumExtra extra) {
        this.host = host;
        this.extra = extra;
    }

    private Booking host;
    private PremiumExtra extra;
    public boolean hasTalkback() {
        return this.host.show.hasOwnProperty("talkback");
    }

    public boolean hasDinner() {
        return this.extra.hasOwnProperty("dinner") && ! this.host.isPeakDay();
    }

    public double extendsBasePrice(double result) {

        return Math.round(result) + this.extra.getPremiumFee();

    }
}
