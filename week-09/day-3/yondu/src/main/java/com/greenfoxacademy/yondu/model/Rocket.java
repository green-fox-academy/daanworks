package com.greenfoxacademy.yondu.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Rocket {

    private Integer caliber25 = 0;
    private Integer caliber30 = 0;
    private Integer caliber50 = 0;
    private String shipStatus = "empty";
    private Boolean ready = false;

}
