package com.babinszky.garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    public List<Plants> plantsList = new ArrayList<Plants>();

    public void gardenStatus() {

        for (Plants plant : plantsList) {

            if(plant.plantType.equals("Flower")) {
                if(plant.waterAmount < 5) {
                    System.out.println("The " + plant.plantColor + " " + plant.plantType + " needs water");
                } else {
                    System.out.println("The " + plant.plantColor + " " + plant.plantType + " doesn't need water");
                }
            }

            if(plant.plantType.equals("Tree")) {
                if(plant.waterAmount < 10) {
                    System.out.println("The " + plant.plantColor + " " + plant.plantType + " needs water");
                } else {
                    System.out.println("The " + plant.plantColor + " " + plant.plantType + " doesn't need water");
                }
            }
        }
    }

    public void watering(double amount) {

        List<Plants> thirstyPlants = new ArrayList<>();

        double eachAmount;

        for (Plants plant : plantsList) {
            if(plant.plantType.equals("Flower") && plant.waterAmount < 5) {
                thirstyPlants.add(plant);
            }
            if(plant.plantType.equals("Tree") && plant.waterAmount < 10) {
                thirstyPlants.add(plant);
            }
        }

        eachAmount = amount / thirstyPlants.size();

        for (Plants plant : plantsList) {
            if(plant.plantType.equals("Flower") && plant.waterAmount < 5) {
                plant.waterAmount = plant.waterAmount + (eachAmount * 0.75);
            }
            if(plant.plantType.equals("Tree") && plant.waterAmount < 10) {
                plant.waterAmount = plant.waterAmount + (eachAmount * 0.4);
            }
        }

        System.out.println("Watering with " + amount);

    }

}
