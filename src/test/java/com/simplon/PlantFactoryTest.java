package com.simplon;

import org.junit.Test;

import static junit.framework.Assert.*;

public class PlantFactoryTest {


    @Test
    public void plantFactory_create_fruit_apple() {
        //set
        PlantFactory fruitFactory = new FruitFactory();

        //test
        Plant result = fruitFactory.createPlant(TypePlant.APPLE);
        //assert
        assertTrue(result.name.equals("Apple"));
        assertEquals(new Apple(), result);
    }

    @Test
    public void plantFactory_create_vegetable_tomato() {
        //set
        PlantFactory vegetableFactory = new VegetableFactory();

        //test
        Plant result = vegetableFactory.createPlant(TypePlant.TOMATO);
        //assert
        assertTrue(result.name.equals("Tomato"));
        assertEquals(new Tomato(), result);
    }

    @Test
    public void plantFactory_create_vegetable_potato() {
        //set
        PlantFactory vegetableFactory = new VegetableFactory();

        //test
        Plant result = vegetableFactory.createPlant(TypePlant.POTATO);
        //assert
        assertTrue(result.name.equals("Potato"));
        assertEquals(new Potato(), result);
    }

    @Test
    public void putWaterLevel_fruit_apple() {
        //set
        PlantFactory fruitFactory = new FruitFactory();
        Plant apple = fruitFactory.createPlant(TypePlant.APPLE);
        //test
        apple.putWaterLevel();
        //assert
        assertTrue(apple.waterLevel == 5);
    }

    @Test
    public void putWaterLevel_vegetable_tomato() {
        //set
        PlantFactory vegetableFactory = new VegetableFactory();
        Plant tomato = vegetableFactory.createPlant(TypePlant.TOMATO);
        //test
        tomato.putWaterLevel();
        //assert
        assertTrue(tomato.waterLevel == 1);
    }

    @Test
    public void putWaterLevel_vegetable_potato() {
        //set
        PlantFactory vegetableFactory = new VegetableFactory();
        Plant potato = vegetableFactory.createPlant(TypePlant.POTATO);
        //test
        potato.putWaterLevel();
        //assert
        assertTrue(potato.waterLevel == 2);
    }

    @Test
    public void putFertilizer_fruit_apple() {
        //set
        PlantFactory fruitFactory = new FruitFactory();
        Plant apple = fruitFactory.createPlant(TypePlant.APPLE);
        //test
        apple.putFertilizer();
        //assert
        assertTrue(apple.fertilizer == 2);
    }

    @Test
    public void putFertilizer_vegetable_tomato() {
        //set
        PlantFactory vegetableFactory = new VegetableFactory();
        Plant tomato = vegetableFactory.createPlant(TypePlant.TOMATO);
        //test
        tomato.putFertilizer();
        //assert
        assertTrue(tomato.fertilizer == 5);
    }

    @Test
    public void putFertilizer_vegetable_potato() {
        //set
        PlantFactory vegetableFactory = new VegetableFactory();
        Plant potato = vegetableFactory.createPlant(TypePlant.POTATO);
        //test
        potato.putFertilizer();
        //assert
        assertTrue(potato.fertilizer == 3);
    }




}
