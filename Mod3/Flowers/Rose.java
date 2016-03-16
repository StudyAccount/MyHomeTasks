package com.goit.gojavaonline;

import javax.sound.midi.Soundbank;

/**
 * Created by User on 06.03.2016.
 */
public class Rose extends Flower {

    public Rose(String name, String colour, int flowerPrice){
        super("Rose", colour, flowerPrice);
    }

    @Override
    public void smell() {
        System.out.println("Your roses smells very sweetly");
    }
}
