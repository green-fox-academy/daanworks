package com.greenfoxacademy.colors;

import com.greenfoxacademy.colors.controller.GreenColor;
import com.greenfoxacademy.colors.controller.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorsApplication implements CommandLineRunner {

    private RedColor red;
    private GreenColor green;

    @Autowired
    ColorsApplication(RedColor red, GreenColor green) {
        this.red = new RedColor();
        this.green = new GreenColor();
    }

    public static void main(String[] args) {
        SpringApplication.run(ColorsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        red.printColor();
        green.printColor();
    }
}
