package com.greenfoxacademy.gardenexam;

public abstract class Plant {

    protected String color;
    protected int waterLevel;

    public boolean isNeedWater() {
        return this.waterLevel < this.getNeedsWater();
    }

    public abstract String getType();

    public abstract int getNeedsWater();

    public abstract double getAbsorbWater();

    public String getColor() {
        return this.color;
    }

    public void addWater(int amount) {
        waterLevel += (int) (amount * getAbsorbWater());
    }

}