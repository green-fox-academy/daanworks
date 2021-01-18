package com.greenfoxacademy.programmerfoxclub.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private List<String> listOfTricks = new ArrayList<>();
    private String food = "Pizza";
    private String drink = "Lemonade";

}
