package com.arek;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("classic","white", "beef", 15.30);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.27);
        hamburger.addHamburgerAddition3("Cheese",0.27);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("beef",12.5);
        healthyBurger.addHamburgerAddition1("Egg", 0.5);
        healthyBurger.addHealthyAddition1("Lentils",3.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeHamburger db = new DeluxeHamburger();
        db.itemizeHamburger();
    }
}
