package com.example.day3;

import com.example.day3.models.GreenColor;
import com.example.day3.models.RedColor;
import com.example.day3.services.MyColor;
import com.example.day3.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day3Application implements CommandLineRunner {

    private MyColor myColor;
    private Printer printer;

    @Autowired
    Day3Application(MyColor myColor, Printer printer) {
        this.myColor = myColor;
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(Day3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myColor.printColor();
        printer.log(myColor.printColor());
    }
}
