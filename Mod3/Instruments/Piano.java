package com.goit.gojavaonline;

/**
 * Created by User on 07.03.2016.
 */
public class Piano extends Instrument {

    public Piano(String name, String manufacturer, float price) {
        super("Piano", manufacturer, price);
    }

    @Override
    public void sound() {
        System.out.println("Has a piano sound");
    }
}
