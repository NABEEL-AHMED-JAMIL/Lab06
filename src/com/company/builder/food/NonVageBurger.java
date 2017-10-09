package com.company.builder.food;

import com.company.builder.itemwrape.Packing;
import com.company.builder.itemwrape.Wrapper;

/**
 * Created by Nabeel on 10/5/2017.
 */
public class NonVageBurger extends Burger {

    private float price = 25.0f;

    static {
        System.out.println("Total Cost: " + " Non-Vage-Burger");
    }

    @Override
    public String getName() {
        return "NoN-Vage-Burger";
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
