package com.company;
/**
 * This class extends from cereal and sets the values of the 2 variables
 * It then overrides a method in the cereal class
 */
public class LuckyCharms extends Cereal{
    /**
     * This method sets the values of the 2 variables
     */
    public LuckyCharms(){
        this.name = "Lucky Charms";
        this.price = 1.55;
    }
    /**
     * This method calls the prepare class in the main class and
     * then overrides it to print extra output
     */
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("-Gather the grain\n" +
                "-Shape into circles\n" +
                "-Create marshmellow Shapes\n" +
                "-Mix Circles with Marshmellows");
    }
}
