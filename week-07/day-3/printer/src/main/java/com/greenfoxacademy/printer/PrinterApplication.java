package com.greenfoxacademy.printer;

import com.greenfoxacademy.printer.controller.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.event.PaintEvent;

@SpringBootApplication
public class PrinterApplication implements CommandLineRunner {

    private Printer printer;

    @Autowired
    PrinterApplication(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(PrinterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("FUCK YOU BOII");
        printer.setSize(10);
        System.out.println(printer.getSize());
    }
}
