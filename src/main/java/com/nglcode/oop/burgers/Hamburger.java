package com.nglcode.oop.burgers;

import java.util.Locale;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.printf(Locale.ENGLISH, "%s hamburger on a %s roll with %s, price is %.2f%n", name, breadRollType, meat, price);
    }

    public Hamburger() {
    }

    public void addHamburgerAddition1(String addition, double price) {
        addition1Name = addition;
        addition1Price = price;
        System.out.printf(Locale.ENGLISH, "Added %s for an extra %.2f%n", addition1Name, addition1Price);
        this.price += price;
    }

    public void addHamburgerAddition2(String addition, double price) {
        addition2Name = addition;
        addition2Price = price;
        System.out.printf(Locale.ENGLISH, "Added %s for an extra %.2f%n", addition2Name, addition2Price);
        this.price += price;
    }

    public void addHamburgerAddition3(String addition, double price) {
        addition3Name = addition;
        addition3Price = price;
        System.out.printf(Locale.ENGLISH, "Added %s for an extra %.2f%n", addition3Name, addition3Price);
        this.price += price;
    }

    public void addHamburgerAddition4(String addition, double price) {
        addition4Name = addition;
        addition4Price = price;
        System.out.printf(Locale.ENGLISH, "Added %s for an extra %.2f%n", addition4Name, addition4Price);
        this.price += price;
    }

    public double itemizeHamburger() {
        //includes the base price of the hamburger plus any additional items
        return this.price;
    }


}
