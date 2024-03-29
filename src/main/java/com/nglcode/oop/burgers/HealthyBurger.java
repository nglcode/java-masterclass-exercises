package com.nglcode.oop.burgers;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
        addHamburgerAddition1(healthyExtra1Name, healthyExtra1Price);
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
        addHamburgerAddition2(healthyExtra2Name, healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
