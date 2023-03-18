package com.nglcode.oop.challenge2;

public class Side extends Item {

    public Side(String type, double price) {
        super("Side", type, price);
    }

    public String getName() {
        return super.getName() + " " + super.getSize();
    }

    public double getAdjustedPrice() {
        return switch (getSize()) {
            case "S" -> getBasePrice() - 0.5;
            case "M" -> getBasePrice() + 1;
            case "L" -> getBasePrice() + 1.5;
            default -> getBasePrice();
        };
    }

    public void printItem() {
        Item.printItem(getName(), getAdjustedPrice());
    }
}
