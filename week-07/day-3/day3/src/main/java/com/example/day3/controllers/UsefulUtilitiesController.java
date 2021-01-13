package com.example.day3.controllers;

import com.example.day3.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {

    private UtilityService utilityService;

    @Autowired
    UsefulUtilitiesController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String index() {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("randomColor", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String email(@RequestParam String email, String color, Model model) {
        model.addAttribute("validateEmail", utilityService.validateEmail(email).get(0));
        model.addAttribute("color", utilityService.validateEmail(email).get(1));
        return "email";
    }

    @GetMapping("/useful/encode")
    public String encode(@RequestParam String word, @RequestParam int number, Model model) {
        model.addAttribute("result", utilityService.caesar(word, number));
        return "ceasar";
    }

    @GetMapping("/useful/decode")
    public String decode(@RequestParam String word, @RequestParam int number, Model model) {
        model.addAttribute("result", utilityService.caesar(word, number * -1));
        return "ceasar";
    }
}
