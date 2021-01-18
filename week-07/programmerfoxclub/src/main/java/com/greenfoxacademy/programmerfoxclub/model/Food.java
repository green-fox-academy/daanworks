package com.greenfoxacademy.programmerfoxclub.model;

public enum Food {
    PIZZA("Pizza"),
    HAMBURGER("Hamburger"),
    KEBAB("Kebab"),
    CHICKEN("Chicken");

    private final String displayValue;

    Food(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
