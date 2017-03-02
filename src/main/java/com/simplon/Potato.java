package com.simplon;

/**
 * Created by alonso on 01/03/17.
 */
public class Potato extends Plant {


    public Potato () {
        this.name = "Potato";
    }

    @Override
    public void putWaterLevel(){
        this.waterLevel = 2;
    }

    @Override
    public void putFertilizer(){
        this.fertilizer = 3;
    }
}
