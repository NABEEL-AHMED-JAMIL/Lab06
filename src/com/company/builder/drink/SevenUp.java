package com.company.builder.drink;

/**
 * Created by Nabeel on 10/5/2017.
 */
public class SevenUp extends CollDrink{

    private float price = 25.0f;

    static {
        System.out.println("Total Cost: " + " Seven-Up");
    }

    @Override
    public String getName() { return "Seven-Up"; }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) { this.price = price; }
}
