package com.goit.gojavaonline;

import java.util.ArrayList;

/**
 * Created by User on 07.03.2016.
 */
public class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList<Flower>();

    private float bouquetPrice;

    public void setBouquetPrice(float bouquetPrice) {
        this.bouquetPrice = bouquetPrice;
    }

    public float getBouquetPrice() {
        return bouquetPrice;
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);

    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void createBouquet(){
        if (flowers != null){
            for (int counter = 0; counter <flowers.size(); counter++){
                Flower flower = flowers.get(counter);
                bouquetPrice  = flower.flowerPrice * (counter+1);

                System.out.println("- " + flower.name + " " + flower.colour + " " + flower.flowerPrice);
            }
            System.out.println("Your bouquet price is " + bouquetPrice);;
        }

    }

}
