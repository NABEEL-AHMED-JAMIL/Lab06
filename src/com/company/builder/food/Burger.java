package com.company.builder.food;

import com.company.builder.cheif.Item;
import com.company.builder.itemwrape.Packing;
import com.company.builder.itemwrape.Wrapper;

/**
 * Created by Nabeel on 10/5/2017.
 */
public abstract class Burger implements Item{

    @Override
    public Packing getPaking() {
        return new Wrapper();
    }

    public abstract void setPrice(float price);
}
