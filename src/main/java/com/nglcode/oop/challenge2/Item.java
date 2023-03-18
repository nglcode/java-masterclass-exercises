package com.nglcode.oop.challenge2;

public class Item {

    private String name;
    private String type;
    private String size;
    private double price;


    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Item(String name, String type, String size, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }
}
