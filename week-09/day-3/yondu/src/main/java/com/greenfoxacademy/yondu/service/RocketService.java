package com.greenfoxacademy.yondu.service;

import com.greenfoxacademy.yondu.model.Rocket;
import org.springframework.stereotype.Service;

@Service
public class RocketService {

    public Rocket fill(Rocket rocket, String caliber, Integer amount) {

        int MAX = 12500;
        int currentAmount = rocket.getCaliber25() + rocket.getCaliber30() + rocket.getCaliber50();
        int treshold = 12500 - currentAmount;

        if(currentAmount + amount >= MAX) {
            switch (caliber) {
                case ".25":
                    rocket.setCaliber25(rocket.getCaliber25() + treshold);
                    break;
                case ".30":
                    rocket.setCaliber30(rocket.getCaliber30() + treshold);
                    break;
                case ".50":
                    rocket.setCaliber50(rocket.getCaliber50() + treshold);
                    break;
            }
        } else {
            switch (caliber) {
                case ".25":
                    rocket.setCaliber25(rocket.getCaliber25() + amount);
                    break;
                case ".30":
                    rocket.setCaliber30(rocket.getCaliber30() + amount);
                    break;
                case ".50":
                    rocket.setCaliber50(rocket.getCaliber50() + amount);
                    break;
            }
        }

        currentAmount = rocket.getCaliber25() + rocket.getCaliber30() + rocket.getCaliber50();

        if(currentAmount == 12500) {
            rocket.setReady(true);
        }

        if(currentAmount == 0) {
            rocket.setShipStatus("empty");
        } else if (currentAmount > 0 && currentAmount < MAX) {
            rocket.setShipStatus(currentAmount / (MAX / 100) + "%");
        } else {
            rocket.setShipStatus("full");
        }

        return rocket;
    }

}
