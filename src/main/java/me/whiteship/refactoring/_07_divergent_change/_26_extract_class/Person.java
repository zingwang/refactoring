package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class Person {


    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    private final TelephoneNumber telephoneNumber = new TelephoneNumber(this.telephoneNumber.getAreaCode(),this.telephoneNumber.getNumber());
    private String name;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String telephoneNumber(){
        return this.telephoneNumber.toString();
    }

}
