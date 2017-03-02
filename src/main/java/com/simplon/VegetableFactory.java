package com.simplon;

/**
 * Created by alonso on 01/03/17.
 */
public class VegetableFactory extends PlantFactory {

    @Override
    public Plant createPlant(TypePlant typePlant){
        Plant plant = null;
        switch (typePlant){
            case TOMATO: plant = new Tomato(); break;
            case POTATO: plant = new Potato(); break;
            default: break;
        }
        return plant;
    }

}
