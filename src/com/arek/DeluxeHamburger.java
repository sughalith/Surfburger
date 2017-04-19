package com.arek;

/**
 * Created by Arek on 2017-02-16.
 */
public class DeluxeHamburger extends  Hamburger{

    public DeluxeHamburger() {
        super("Deluxe", "White", "Sousage and Bacon", 14.54);
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You can't add items");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You can't add items");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You can't add items");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You can't add items");
    }
}

