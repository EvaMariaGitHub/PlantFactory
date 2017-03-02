package com.simplon;

/**
 * Created by alonso on 01/03/17.
 */
public class Apple extends Plant {

    public Apple () {
        this.name = "Apple";
    }

    @Override
    public void putWaterLevel(){
        this.waterLevel = 5;

    }

    @Override
    public void putFertilizer(){
        this.fertilizer = 2;
    }


}
