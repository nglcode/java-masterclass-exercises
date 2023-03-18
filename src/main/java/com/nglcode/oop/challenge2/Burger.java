package com.nglcode.oop.challenge2;

public class Burger extends Item {

    private String extra1;
    private String extra2;
    private String extra3;

    public Burger(String type, double price) {
        super("Burger", type, price);
    }

    public void addToppings() {

    }

    public void getBasePrice() {

    }

    public void getAdjustedPrice() {

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
}
