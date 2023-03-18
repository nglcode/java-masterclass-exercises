package com.nglcode.oop.challenge2;

public class Drink extends Item {


    public Drink(String type, String size, double price) {
        super("Drink", type, size, price);
    }

    public double getBasePrice() {
        return super.getPrice();
    }

    public void getAdjustedPrice() {

    }

    @Override
    public String toString() {
        return "Drink{} " + super.toString();
    }
}
