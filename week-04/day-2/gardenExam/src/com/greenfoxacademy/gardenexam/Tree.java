package com.greenfoxacademy.gardenexam;

public class Tree extends Plant {

    Tree(String color) {
        this.waterLevel = 0;
        this.color = color;
    }

    @Override
    public String getType() {
        return "Tree";
    }

    @Override
    public int getNeedsWater() {
        return 10;
    }

    @Override
    public double getAbsorbWater() {
        return 0.4;
    }

}
