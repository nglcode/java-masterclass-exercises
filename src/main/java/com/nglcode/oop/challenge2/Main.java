package com.nglcode.oop.challenge2;

public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger("BigMac", 10);
        Drink drink = new Drink("Tea", "M", 3);
        Side side = new Side("Salad", 5);

        MealOrder mealOrder1 = new MealOrder(burger, drink, side);
        mealOrder1.printItemizedList();
        mealOrder1.printTotal();


        MealOrder mealOrder2 = new MealOrder();
        mealOrder2.addToppings("Bacon", "Cheese", "Ketchup");
        mealOrder2.setDrinkSize("L");
        mealOrder2.printItemizedList();
        mealOrder2.printTotal();

    }
}
