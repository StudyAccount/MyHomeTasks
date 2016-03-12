package com.goit.gojavaonline;

/**
 * Created by User on 11.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        Flower flower = new Flower("Rose","red",12.50f);
        Flower flower2 = new Flower("Rose","yellow",12.50f);
        Rose flower3 = new Rose("Tulip","white",12.50f);
        Flower flower4 = new Flower("Tulip","red",2.50f);




       Bouquet bouquet = new Bouquet();
        bouquet.addFlower(flower);
        bouquet.addFlower(flower2);
        bouquet.addFlower(flower3);

        bouquet.createBouquet();

        //flower3.description();

    }
}
