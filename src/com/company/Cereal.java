package com.company;
/**
 * Author: Adam Farley
 * This class has 3 methods that print output and uses the variables
 * to know what name or price you are trying to print
 */
public class Cereal {
    protected String name;
    protected Double price;
    /**
     * outputs string + name
     */
    public void prepare(){
        System.out.println("Preparing the " + this.name);
    }
    /**
     * outputs string with the name inserted
     */
    public void boxCereal(){
        System.out.println("Drawing fun pictures of " + this.name +
                " on the box\nPouring the "
                + this.name + " into the box");
    }
    /**
     * outputs string with the price and name
     */
    public void priceCereal(){
        System.out.println("Putting price tags of $ " + this.price
        + " on the " + this.name + " box");
    }
}
