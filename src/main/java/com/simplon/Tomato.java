package com.simplon;

/**
 * Created by alonso on 01/03/17.
 */
public class Tomato extends Plant {

    public Tomato () {
        this.name = "Tomato";
    }

    @Override
    public void putWaterLevel(){
        this.waterLevel = 1;

    }

    @Override
    public void putFertilizer(){
        this.fertilizer = 5;
    }

}
