package com.example.day3.models;

import com.example.day3.services.MyColor;

public class GreenColor implements MyColor {
    @Override
    public String printColor() {
        return "Printing green color...";
    }
}
