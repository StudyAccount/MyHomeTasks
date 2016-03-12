package com.goit.gojavaonline;

/**
 * Created by User on 06.03.2016.
 */
public class Flower {

    protected String name;
    protected String colour;
    protected float flowerPrice;

    public Flower(){

    }

    public Flower(String name, String colour, float flowerPrice){
        this.colour = colour;
        this.name = name;
        this.flowerPrice = flowerPrice;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFlowerPrice(float flowerPrice) {
        this.flowerPrice = flowerPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public float getFlowerPrice() {
        return flowerPrice;
    }

    public void description(){

        System.out.println("Your flower calls "+ name);
        System.out.println("Your flower is " + colour + " coloured");
        System.out.println("It costs " + flowerPrice + "UAH");
    }
}
