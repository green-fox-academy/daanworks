package com.greenfoxacademy.gardenexam;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> plants;


    Garden() {
        plants = new ArrayList<>();
    }


    public void addPlant(Plant plant) {
        plants.add(plant);
    }


    public void gardenStatus() {
        for (Plant plant : plants) {
            if (plant.isNeedWater()) {
                System.out.println("The " + plant.getColor() + " " + plant.getType() + " needs water");
            } else {
                System.out.println("The " + plant.getColor() + " " + plant.getType() + " doesn't need water");
            }
        }
    }


    public int howManyNeedsWater() {

        int counter = 0;

        for (Plant plant : plants) {
            if(plant.isNeedWater()) {
                ++counter;
            }
        }

        return counter;

    }


    public void watering(int amount) {

        int eachAmount = amount / howManyNeedsWater();

        System.out.println("Watering with " + amount);

        for (Plant plant : plants) {
            plant.addWater(eachAmount);
        }

    }


}
