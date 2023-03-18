package com.nglcode.oop.challenge2;

public class Item {

    private String name;
    private String type;
    private String size = "M";
    private double price;


    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public Item(String name, String type, String size, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
        this.size = size.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getBasePrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

}
