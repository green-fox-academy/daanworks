package com.greenfoxacademy.programmerfoxclub.model;

public enum Trick {
    KNOWINGHOWTOKNOW("Knowing how to know"),
    MEDITATE("Meditate"),
    BREATHE("Breathe"),
    QIGONG("Qi-Gong");

    private final String displayValue;

    Trick(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
