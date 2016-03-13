package com.goit.gojavaonline;

import java.security.PublicKey;

/**
 * Created by User on 07.03.2016.
 */
public abstract class Instrument {
    protected String name;
    protected String manufacturer;
    protected float price;

    public Instrument(String name,String manufacturer, float price){
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String  getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void lot(){
        System.out.println("*"+name+" "+manufacturer+" "+price);
    }

    public abstract void sound();
}
