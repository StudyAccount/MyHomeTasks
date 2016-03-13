package com.goit.gojavaonline;

import javax.swing.*;

/**
 * Created by User on 13.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        Instrument instrument = new Guitar("Guitar", "Yamaha", 123.45f);
        Instrument instrument2 = new Guitar("Guitar", "Yamaha", 123.45f);
        Instrument instrument3 = new Piano("Piano", "Mason&Hamlin", 123.45f);
        Instrument instrument4 = new Trumplet("Trumplet", "Sovok", 123.45f);

    }
}
