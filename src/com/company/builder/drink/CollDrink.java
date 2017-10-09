package com.company.builder.drink;

import com.company.builder.cheif.Item;
import com.company.builder.itemwrape.Bottle;
import com.company.builder.itemwrape.Packing;

/**
 * Created by Nabeel on 10/5/2017.
 */
public abstract class CollDrink implements Item{

    @Override
    public Packing getPaking() {
        return new Bottle();
    }

    public abstract void setPrice(float price);
}
