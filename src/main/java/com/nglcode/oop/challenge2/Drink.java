package com.nglcode.oop.challenge2;

public class Drink extends Item {


    public Drink(String type, String size, double price) {
        super("Drink", type, size, price);
    }

    public double getAdjustedPrice() {
        return switch (getSize()) {
            case "S" -> getBasePrice() - 0.5;
            case "M" -> getBasePrice() + 1;
            case "L" -> getBasePrice() + 1.5;
            case "XL" -> getBasePrice() + 2;
            default -> getBasePrice();
        };
    }

    public String getName() {
        return super.getName() + " " + super.getSize();
    }

    public void printItem() {
        Item.printItem(getName(), getAdjustedPrice());
    }
}
