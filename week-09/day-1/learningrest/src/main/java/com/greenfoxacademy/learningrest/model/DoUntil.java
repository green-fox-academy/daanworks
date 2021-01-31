package com.greenfoxacademy.learningrest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoUntil {

    private Integer result;

    public DoUntil(String action, Integer until) {
        this.result = doUntilFunction(action, until);
    }

    public Integer doUntilFunction(String action, Integer until) {
        if(action.equals("sum")) {
            return sum(until);
        } else if(action.equals("factor")) {
            return factor(until);
        } else return null;
    }

    public Integer sum(Integer until) {
        result = 0;
        for (Integer i = 1; i <= until; i++) {
            result = result + i;
        }
        return result;
    }

    public Integer factor(Integer until) {
        result = 1;
        for (Integer i = 1; i <= until; i++) {
            result = result * i;
        }
        return result;
    }
}
