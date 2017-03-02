package com.simplon;

/**
 * Created by alonso on 01/03/17.
 */
public abstract class Plant {
    protected String name;
    protected int waterLevel;
    protected int fertilizer;

    public abstract void putWaterLevel();
    public abstract void putFertilizer();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plant plant = (Plant) o;

        if (waterLevel != plant.waterLevel) return false;
        if (fertilizer != plant.fertilizer) return false;
        return name != null ? name.equals(plant.name) : plant.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + waterLevel;
        result = 31 * result + fertilizer;
        return result;
    }
}
