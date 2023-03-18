package com.nglcode.oop.challenge2;

public class Side extends Item {

    public Side(String type, double price) {
        super("Side", type, price);
    }

    public double getBasePrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Side{} " + super.toString();
    }
}
