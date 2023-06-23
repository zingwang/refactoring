package me.whiteship.refactoring._10_data_clumps;

public class TelephonNumber {
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String areaCode;

    private String number;
    @Override
    public String toString(){
        return this.areaCode + "-" + this.number;
    }


}
