package com.babinszky.garden;

public class Main {

    public static void main(String[] args) {

        Plants flower1 = new Plants("yellow", "Flower");
        Plants flower2 = new Plants("blue", "Flower");
        Plants tree1 = new Plants("purple", "Tree");
        Plants tree2 = new Plants("orange", "Tree");

        Garden garden = new Garden();

        garden.plantsList.add(flower1);
        garden.plantsList.add(flower2);
        garden.plantsList.add(tree1);
        garden.plantsList.add(tree2);

        garden.gardenStatus();

        garden.watering(40);
        garden.gardenStatus();
        garden.watering(70);
        garden.gardenStatus();

    }

}
