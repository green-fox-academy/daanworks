package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument {

    public int numberOfStrings;

    abstract String sound();

    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }

}
