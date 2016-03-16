package com.goit.gojavaonline;

/**
 * Created by User on 06.03.2016.
 */
public abstract class Flower {

    protected String name;
    protected String colour;
    protected int flowerPrice;

    public Flower(String name, String colour, int flowerPrice){
        this.colour = colour;
        this.name = name;
        this.flowerPrice = flowerPrice;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFlowerPrice(int flowerPrice) {
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

    public int getFlowerPrice() {
        return flowerPrice;
    }

    public void description(){

        System.out.println("Your flower calls " + name);
        System.out.println("Your flower is " + colour + " coloured");
        System.out.println("It costs " + flowerPrice/100 + " UAH");
    }

    public void grouse(){
        System.out.println("Your flower grouse in a mr's Mc'Donalds farm ");
    }

    public abstract void smell();

}
