package com.nglcode.oop.burgers;

public class DeluxeBurger extends Hamburger {

    private String errorMessage = "Cannot not add additional items to a deluxe burger";

    public DeluxeBurger() {
        super();

    }

    @Override
    public void addHamburgerAddition1() {
        System.out.println(errorMessage);
    }

    @Override
    public void addHamburgerAddition2() {
        System.out.println(errorMessage);
    }

    @Override
    public void addHamburgerAddition3() {
        System.out.println(errorMessage);
    }

    @Override
    public void addHamburgerAddition4() {
        System.out.println(errorMessage);
    }

}
