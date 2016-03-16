package com.goit.gojavaonline;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 07.03.2016.
 */
public class Bouquet {

    protected List<Flower> flowers = new ArrayList<Flower>();

    protected int bouquetPrice;

    public void setBouquetPrice(int bouquetPrice) {
        this.bouquetPrice = bouquetPrice;
    }

    public float getBouquetPrice() {
        return bouquetPrice;
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);

    }

    public List getFlowers() {
        return flowers;
    }

    public void createBouquet(){
        if (!flowers.isEmpty()){

            for (Flower flowerInBouquet : flowers) {
                bouquetPrice  += flowerInBouquet.flowerPrice;
                System.out.println("- " + flowerInBouquet.name + " " + flowerInBouquet.colour + " " + flowerInBouquet.flowerPrice);
            }
            System.out.println("Your bouquet price is " + bouquetPrice);;
        }

    }

}
