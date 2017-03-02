package com.simplon;

/**
 * Created by alonso on 01/03/17.
 */
public class FruitFactory extends PlantFactory {

    @Override
    public Plant createPlant(TypePlant typePlant){
        Plant plant = null;
        switch (typePlant){
            case APPLE: plant = new Apple(); break;
            default : break;
        }
        return plant;
    }
}
