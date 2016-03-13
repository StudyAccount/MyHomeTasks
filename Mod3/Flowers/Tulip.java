package com.goit.gojavaonline;

/**
 * Created by User on 07.03.2016.
 */
public class Tulip extends Flower {

    public Tulip(String name, String colour, float flowerPrice) {
        super("Tulip",colour,flowerPrice);
    }

    @Override
    public void smell() {
        System.out.println("Your tulips have no smell");
    }
}
