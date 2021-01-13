package com.greenfoxacademy.colors.controller;

import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("Printing green color...");
    }
}
