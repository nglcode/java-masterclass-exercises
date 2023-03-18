package com.nglcode.oop.challenge2;

public class MealOrder {

    private Burger burger;
    private Drink drink;
    private Side side;

    public MealOrder() {
        burger = new Burger("Regular", 10);
        drink = new Drink("Coke", "S", 5);
        side = new Side("Fries", 3);
    }

    public MealOrder(Burger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

    public void printItemizedList() {
        burger.printItem(burger.getName(),burger.getAdjustedPrice());
        drink.printItem(drink.getName(),drink.getAdjustedPrice());
        side.printItem(side.getName(),side.getAdjustedPrice());
    }

    public void printTotal() {
        double total = burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
        System.out.println("TOTAL: " + total);
        System.out.println("________________");
    }

    @Override
    public String toString() {
        return "MealOrder{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", side=" + side +
                '}';
    }
}