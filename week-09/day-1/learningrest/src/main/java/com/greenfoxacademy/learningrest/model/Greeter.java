package com.greenfoxacademy.learningrest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Greeter {
    private String name;
    private String title;
    private String welcome_message;

    public Greeter(String name, String title) {
        this.name = name;
        this.title = title;
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}
