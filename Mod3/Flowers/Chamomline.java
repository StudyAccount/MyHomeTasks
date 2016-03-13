package com.goit.gojavaonline;

/**
 * Created by User on 07.03.2016.
 */
public class Chamomline extends Flower {

    public Chamomline(String name, String colour, float flowerPrice) {
        super("Chamomline",colour,flowerPrice);
    }

    @Override
    public void smell() {
        System.out.println("Your Chamomline smells not so good");
    }
}
