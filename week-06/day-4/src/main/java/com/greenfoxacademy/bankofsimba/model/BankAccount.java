package com.greenfoxacademy.bankofsimba.model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String name;
    private Double balance;
    private String animalType;
    private Long index;
    private boolean isKing;

    public BankAccount(String name, Double balance, String animalType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    private static DecimalFormat df2 = new DecimalFormat("#.00");

    public String getFormattedBalance() {
        return df2.format(balance);
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean getIsKing() {
        return isKing;
    }

    public String getStyle() {
        if(this.isKing) {
            return "king";
        } else {
            return "poor-user";
        }
    }
}
