package com.nglcode.oop.challenge2;

public class Burger extends Item {

    private String extra1;
    private String extra2;
    private String extra3;

    public Burger(String type, double price) {
        super("Burger", type, price);
        extra1 = "none";
        extra2 = "none";
        extra3 = "none";
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public double getBasePrice() {
        return super.getPrice();
    }

    public double getAdjustedPrice() {
        return super.getPrice();
    }

    public String getExtra1() {
        return extra1;
    }

    public String getExtra2() {
        return extra2;
    }

    public String getExtra3() {
        return extra3;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "extra1='" + extra1 + '\'' +
                ", extra2='" + extra2 + '\'' +
                ", extra3='" + extra3 + '\'' +
                "} " + super.toString();
    }
}

class DeluxeBurger extends Burger {

    private String deluxeExtra1;
    private String deluxeExtra2;

    public DeluxeBurger(String type, double price, String deluxeExtra1, String deluxeExtra2) {
        super(type, price);
        this.deluxeExtra1 = deluxeExtra1;
        this.deluxeExtra2 = deluxeExtra2;
    }

    public String getDeluxeExtra1() {
        return deluxeExtra1;
    }

    public String getDeluxeExtra2() {
        return deluxeExtra2;
    }
}
