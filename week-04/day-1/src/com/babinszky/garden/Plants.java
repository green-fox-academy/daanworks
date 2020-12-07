package com.babinszky.garden;

public class Plants extends Garden {

    public String plantType;
    public String plantColor;
    public double waterAmount;

    Plants(String plantColor, String plantType) {
        this.plantColor = plantColor;
        this.plantType = plantType;
    }

}
