package com.company;
/**
 * This class extends from cereal and sets the values of the 2 variables
 * It then overrides a method in the cereal class
 */
public class FrostedFlakes extends Cereal {
    /**
     * This method sets the values of the 2 variables
     */
    public FrostedFlakes(){
        this.name = "Frosted Flakes";
        this.price = 2.99;
    }
    /**
     * This method calls the prepare class in the main class and
     * then overrides it to print extra output
     */
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("-Gather the grain\n" +
                "-Shape into flakes\n" +
                "-Sprinkle with frosting");
    }
}
