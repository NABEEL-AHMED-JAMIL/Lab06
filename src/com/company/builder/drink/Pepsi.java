package com.company.builder.drink;

/**
 * Created by Nabeel on 10/5/2017.
 */
public class Pepsi extends CollDrink{

    private float price = 25.0f;


    static {
        System.out.println("Total Cost: " + " Pepsi");
    }

    @Override
    public String getName() { return "Pepsi"; }

    @Override
    public float getPrice() { return price; }

    @Override
    public void setPrice(float price) { this.price = price; }

}
