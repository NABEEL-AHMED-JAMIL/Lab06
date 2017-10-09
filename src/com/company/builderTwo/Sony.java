package com.company.builderTwo;

import com.company.builder.itemwrape.*;

/**
 * Created by Nabeel on 10/5/2017.
 */
public class Sony implements Cd{

    private String cdName = "Pana-Sonic";
    private float price = 10.0f;

    public String getCdName() { return cdName; }

    public void setCdName(String cdName) { this.cdName = cdName; }

    public float getPrice() { return price; }

    public void setPrice(float price) { this.price = price; }

    @Override
    public String pack() { return cdName; }

    @Override
    public Float price() { return price; }

}
