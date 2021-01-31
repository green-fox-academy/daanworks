package com.greenfoxacademy.groot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Groot {

    String received;
    String translated;

    public Groot(String received) {
        this.received = received;
        this.translated = "I am a groot!";
    }
}
