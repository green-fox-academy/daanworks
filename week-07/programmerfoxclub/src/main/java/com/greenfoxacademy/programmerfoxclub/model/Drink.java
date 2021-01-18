package com.greenfoxacademy.programmerfoxclub.model;

public enum Drink {
    LEMONADE("Lemonade"),
    COKE("Coke"),
    SPRITE("Sprite"),
    WATER("Water");

    private final String displayValue;

    Drink(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
