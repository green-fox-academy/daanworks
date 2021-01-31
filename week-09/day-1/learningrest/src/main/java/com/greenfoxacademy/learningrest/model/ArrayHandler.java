package com.greenfoxacademy.learningrest.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArrayHandler {

    Integer result;

    public ArrayHandler(String action, Integer[] numbers) {
        switch (action) {
            case "sum":
                this.result = sum(numbers);
                break;
            case "multiply":
                this.result = multiply(numbers);
                break;
        }
    }

    public Integer sum(Integer[] numbers) {
        result = 0;
        for (Integer number : numbers) {
            result = result + number;
        }
        return result;
    }

    public Integer multiply(Integer[] numbers) {
        result = 1;
        for (Integer number : numbers) {
            result = result * number;
        }
        return result;
    }

}
