package com.nglcode.oop.burgers;

public class DeluxeBurger extends Hamburger {

    private String errorMessage = "Cannot not add additional items to a deluxe burger";

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "White");

    }

    @Override
    public void addHamburgerAddition1(String addition, double price) {
        System.out.println(errorMessage);
    }

    @Override
    public void addHamburgerAddition2(String addition, double price) {
        System.out.println(errorMessage);
    }

    @Override
    public void addHamburgerAddition3(String addition, double price) {
        System.out.println(errorMessage);
    }

    @Override
    public void addHamburgerAddition4(String addition, double price) {
        System.out.println(errorMessage);
    }

}
