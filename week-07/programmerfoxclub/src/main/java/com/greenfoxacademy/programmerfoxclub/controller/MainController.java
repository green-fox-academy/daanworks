package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.User;
import com.greenfoxacademy.programmerfoxclub.service.TrickService;
import com.greenfoxacademy.programmerfoxclub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    UserService userService;
    TrickService trickService;

    @Autowired
    public MainController(UserService userService, TrickService trickService) {
        this.userService = userService;
        this.trickService = trickService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(String name) {
        userService.createUserIfNotExists(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/")
    public String index(@RequestParam (required = false) String name, Model model) {
        try {
            User user = userService.getUserByName(name);
            model.addAttribute("name", user.getName());
            model.addAttribute("listOfTricks", user.getListOfTricks());
            model.addAttribute("tricksCounter", user.getListOfTricks().size());
            model.addAttribute("food", user.getFood());
            model.addAttribute("drink", user.getDrink());
        } catch (NullPointerException e) {
            return "redirect:/login";
        }
        return "index";
    }

    @GetMapping("/nutrition-store")
    public String nutritionStore(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "nutrition-store";
    }

    @PostMapping("/nutrition-store")
    public String postNutritionStore(@RequestParam String name, String food, String drink, Model model) {
        User user = userService.getUserByName(name);
        model.addAttribute("name", name);
        model.addAttribute("food", food);
        model.addAttribute("drink", drink);
        user.setFood(food);
        user.setDrink(drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/trick-center")
    public String trickCenter(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "trick-center";
    }

    @PostMapping("/trick-center")
    public String postTrickCenter(@RequestParam String name, String trick, Model model) {
        User user = userService.getUserByName(name);
        model.addAttribute("name", name);
        if(!user.getListOfTricks().contains(trick)) {
            user.getListOfTricks().add(trick);
        }
        return "redirect:/?name=" + name;
    }

}
