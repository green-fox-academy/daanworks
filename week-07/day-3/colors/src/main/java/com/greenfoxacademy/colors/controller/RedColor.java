package com.greenfoxacademy.colors.controller;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("Printing red color...");
    }
}