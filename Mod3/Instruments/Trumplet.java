package com.goit.gojavaonline;

/**
 * Created by User on 07.03.2016.
 */
public class Trumplet extends Instrument {

    public Trumplet(String name, String manufacturer, float price) {
        super("Trumplet", manufacturer, price);
    }

    @Override
    public void sound() {
        System.out.println("Has a trumplet sound");
    }
}
