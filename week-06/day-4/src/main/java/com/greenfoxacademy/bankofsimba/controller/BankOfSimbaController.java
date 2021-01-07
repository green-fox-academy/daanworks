package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankOfSimbaController {

    BankAccount simbaAccount = new BankAccount("Simba", 2000.12, "lion", false);
    List<BankAccount> accounts = new ArrayList<>();

    public BankOfSimbaController() {
        accounts.add(new BankAccount("Timon", 1500.43, "mongoose", true));
        accounts.add(new BankAccount("Pumbaa", 6642.67, "pig", true));
        accounts.add(new BankAccount("Mufasa", 5432.21, "bird", false));
        accounts.add(new BankAccount("Sarabi", 10000.00, "lion", false));
        accounts.add(simbaAccount);
    }

    @GetMapping("/simbasaccount")
    public String simbasAccount(Model model) {
        model.addAttribute("name", simbaAccount.getName());
        model.addAttribute("type", simbaAccount.getAnimalType());
        model.addAttribute("balance", simbaAccount.getFormattedBalance());
        return "simbasaccount";
    }

    @GetMapping("/enjoyyourself")
    public String enjoyYourself() {
        return "enjoyyourself";
    }

    @GetMapping("/accounts")
    public String accounts(Model model) {
        model.addAttribute("accounts", accounts);
        return "accounts";
    }
}
