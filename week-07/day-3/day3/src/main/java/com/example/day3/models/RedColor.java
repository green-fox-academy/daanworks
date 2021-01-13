package com.example.day3.models;

import com.example.day3.services.MyColor;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {
    @Override
    public String printColor() {
        return "Printing red color...";
    }
}
