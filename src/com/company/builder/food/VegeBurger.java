package com.company.builder.food;

import com.company.builder.itemwrape.Packing;
import com.company.builder.itemwrape.Wrapper;

/**
 * Created by Nabeel on 10/5/2017.
 */
public class VegeBurger extends Burger {

    private float price = 25.0f;

    static {
        System.out.println("Total Cost: " + "Vege-Burger");
    }

    @Override
    public String getName() {
        return "Vege-Burger";
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }
}
