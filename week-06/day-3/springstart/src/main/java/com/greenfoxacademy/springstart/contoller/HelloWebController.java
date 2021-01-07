package com.greenfoxacademy.springstart.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.geom.GeneralPath;

@Controller
public class HelloWebController {
    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        Greeting greeting = new Greeting("");
        model.addAttribute("greetCount", greeting.getGreetCount());
        return "greeting";
    }
}
