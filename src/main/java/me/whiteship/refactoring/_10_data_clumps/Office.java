package me.whiteship.refactoring._10_data_clumps;

public class Office {

    private String location;

    TelephonNumber officePhoneNumber;
    public Office(String location, TelephonNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String officePhoneNumber() {
        return this.officePhoneNumber.toString();
    }

    public String getOfficeAreCode() {
        return this.officePhoneNumber.getAreaCode();
    }

    public void setOfficeAreCode(String officeAreCode) {
        this.officePhoneNumber.setAreaCode(officeAreCode);
    }


}
