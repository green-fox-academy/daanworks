package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    List<User> users = new ArrayList<>(Arrays.asList(new User("Mr. Green", new ArrayList<String>(), "salad", "water"),
            new User("Mr. Blue", new ArrayList<String>(List.of("Knows how to know", "Knows how to do")), "hamburger", "soda")));

    public void createUserIfNotExists(String name) {
        Optional<User> user = users.stream().filter(u -> u.getName().equals(name)).findFirst();
        if(user.isEmpty()) {
            User newUser = new User();
            newUser.setName(name);
            users.add(newUser);
        }
    }

    public User getUserByName(String name) {
        Optional<User> user = users.stream().filter(u -> u.getName().equals(name)).findFirst();
        if (user.isPresent()) {
            return user.get();
        } else {
            return null;
        }
    }

}
