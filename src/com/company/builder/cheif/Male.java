package com.company.builder.cheif;

import com.company.builder.cheif.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nabeel on 10/5/2017.
 */
public class Male {


    static {
        System.out.println("Total Cost: " + " Male");
    }

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.getName());
            System.out.print(", Cd : " + item.getPaking().pack());
            System.out.println(", Price : " + item.getPrice());
        }
    }

    public void updateItem(){

        return;
    }
}
