package com.greenfoxacademy.gardenexam;

public class Flower extends Plant {

    Flower(String color) {
        this.waterLevel = 0;
        this.color = color;
    }


    @Override
    public String getType() {
        return "Flower";
    }

    @Override
    public int getNeedsWater() {
        return 5;
    }

    @Override
    public double getAbsorbWater() {
        return 0.75;
    }


}
