package com.greenfoxacademy.learningrest.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AppendA {
    private String appendable;
    private String appended;

    public AppendA(String appendable) {
        this.appendable = appendable;
        this.appended = appendable + "a";
    }
}
