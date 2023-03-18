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

    public void addToppings() {

    }

    public void setDrinkSize() {

    }

    public void printItemizedList() {

    }

    public void printTotal() {

    }


}
