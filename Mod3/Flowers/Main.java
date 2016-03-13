package com.goit.gojavaonline;

/**
 * Created by User on 11.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        Flower flower = new Tulip("Rose","red",12.50f);
        Flower flower2 = new Tulip("Rose","yellow",12.50f);
        Flower flower3 = new Rose("Tulip","white",12.50f);
        Flower flower4 = new Aster("Tulip","red",2.50f);




       Bouquet bouquet = new Bouquet();
        bouquet.addFlower(flower);
        bouquet.addFlower(flower2);
        bouquet.addFlower(flower3);

        bouquet.createBouquet();

        flower.smell();

        //flower3.description();

    }
}
