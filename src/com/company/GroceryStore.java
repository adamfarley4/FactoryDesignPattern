package com.company;
/**
 * This class has to methods that create an obect of cereal and return
 * them according to what the driver calls for
 */
public class GroceryStore {
    /**
     * Purpose: create an object cereal then cast it into createcereal
     * you then call all the methods in the main class
     * @param type
     * @return
     */
    public Cereal orderCereal(String type) {
        Cereal cereal;

        cereal = createCereal(type);
        cereal.prepare();
        cereal.boxCereal();
        cereal.priceCereal();
        return cereal;
    }
    /**
     * purpose: This method creates a type of cereal and if it equals a
     * certain string value it creates an object according of what that
     * string represents
     * @param type
     * @return
     */
    private Cereal createCereal(String type){
        Cereal cereal = null;
        if(type.equals("frosted flakes")){
            cereal = new FrostedFlakes();
        }else if(type.equals("fruit loops")){
            cereal = new FruitLoops();
        }else if(type.equals("lucky charms")){
            cereal = new LuckyCharms();
        }else{
            cereal = new FrostedFlakes();
        }
        return cereal;
    }
}
