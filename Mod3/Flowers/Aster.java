package com.goit.gojavaonline;

/**
 * Created by User on 07.03.2016.
 */
public class Aster extends Flower {

    public Aster(String name, String colour, float flowerPrice) {
        super("Aster",colour,flowerPrice);
    }

    @Override
    public void smell() {
        System.out.println("Your asters have a sunny smell");
    }
}
