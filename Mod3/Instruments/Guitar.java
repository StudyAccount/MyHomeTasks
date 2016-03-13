package com.goit.gojavaonline;

/**
 * Created by User on 07.03.2016.
 */
public class Guitar extends Instrument {

    public Guitar(String name,String manufacturer,float price){
        super("Guitar", manufacturer,price);
    }

    @Override
    public void sound() {
        System.out.println("Has guitar sound");
    }
}
