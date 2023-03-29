package com.nglcode.oop.burgers;

import java.util.Locale;

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
        System.out.printf(Locale.ENGLISH, "Added %s for an extra %.2f%n", healthyExtra1Name, healthyExtra1Price);
        double adjustedPrice = getPrice()+price;
        setPrice(adjustedPrice);
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
        System.out.printf(Locale.ENGLISH, "Added %s for an extra %.2f%n", healthyExtra2Name, healthyExtra2Price);
        double adjustedPrice = getPrice()+price;
        setPrice(adjustedPrice);
    }

    @Override
    public double itemizeHamburger() {
        return getPrice();
    }
}
