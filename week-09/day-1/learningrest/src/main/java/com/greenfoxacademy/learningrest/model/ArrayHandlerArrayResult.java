package com.greenfoxacademy.learningrest.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ArrayHandlerArrayResult {

    Integer[] result;

    public ArrayHandlerArrayResult(String action, Integer[] numbers) {
        if(action.equals("double")) {
            this.result = doubling(numbers);
        }

    }

    public Integer[] doubling(Integer[] numbers) {
        result = numbers;
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * 2;
        }
        return result;
    }

}
