package com.arek;

/**
 * Created by Arek on 2017-02-16.
 */
public class HealthyBurger  extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healtyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown", meat, price);
    }
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healtyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            hamburgerPrice+=this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for na extra " + this.healthyExtra1Price);
        }
        if(this.healtyExtra2Name != null){
            hamburgerPrice+=this.healthyExtra2Price;
            System.out.println("Added " + this.healtyExtra2Name + " for na extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
