package com.company.builder.cheif;

import com.company.builder.drink.Pepsi;
import com.company.builder.drink.SevenUp;
import com.company.builder.food.NonVageBurger;
import com.company.builder.food.VegeBurger;

/**
 * Created by Nabeel on 10/5/2017.
 */
public class MealBuilder {


    static {
        System.out.println("Total Cost: " + " Male-Builder");
    }

    public Male getVegBurger() {

        Male male = new Male();
        male.addItem(new VegeBurger());
        male.addItem(new Pepsi());
        return male;
    }

    public Male getNonVegBurger() {

        Male male = new Male();
        male.addItem(new NonVageBurger());
        male.addItem(new SevenUp());
        return male;
    }

}
