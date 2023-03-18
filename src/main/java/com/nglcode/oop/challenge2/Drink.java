package com.nglcode.oop.challenge2;

public class Drink extends Item {


    public Drink(String type, String size, double price) {
        super("Drink", type, size, price);
    }

    public double getBasePrice() {
        return super.getPrice();
    }

    public double getAdjustedPrice() {
        double adjustedPrice = getBasePrice();
        switch (getSize()) {
            case "S":
                adjustedPrice = 1;
                break;
            case "M":
                adjustedPrice = 2;
                break;
            case "L":
                adjustedPrice = 3;
                break;
            default:
                adjustedPrice = 2;
        }
        return adjustedPrice;
    }



    @Override
    public String toString() {
        return "Drink{} " + super.toString();
    }
}
