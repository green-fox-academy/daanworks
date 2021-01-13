package com.greenfoxacademy.spellchecker.service;

import org.springframework.stereotype.Service;

@Service
public class SpellChecker {
    public SpellChecker() {
        System.out.println("Inside the SpellChecker constructor");
    }

    public void checkSpelling() {
        System.out.println("Check spelling...");
    }
}
