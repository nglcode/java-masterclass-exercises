package com.nglcode.oop.burgers;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    protected String addition1Name;
    protected double addition1Price;
    protected String addition2Name;
    protected double addition2Price;
    protected String addition3Name;
    protected double addition3Price;
    protected String addition4Name;
    protected double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger() {

    }

    public void addHamburgerAddition1() {

    }

    public void addHamburgerAddition2() {

    }

    public void addHamburgerAddition3() {

    }

    public void addHamburgerAddition4() {

    }

    public double itemizehamburger() {
        //includes the base price of the hamburger plus any additional items
        return 0.0;
    }


}
