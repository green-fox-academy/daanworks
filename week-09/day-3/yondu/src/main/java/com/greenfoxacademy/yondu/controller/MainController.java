package com.greenfoxacademy.yondu.controller;

import com.greenfoxacademy.yondu.model.Rocket;
import com.greenfoxacademy.yondu.model.RocketError;
import com.greenfoxacademy.yondu.model.Yondu;
import com.greenfoxacademy.yondu.model.YonduError;
import com.greenfoxacademy.yondu.service.RocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    RocketService rocketService;

    @Autowired
    public MainController(RocketService rocketService) {
        this.rocketService = rocketService;
    }

    @GetMapping("yondu")
    public ResponseEntity<?> getYondu(@RequestParam (required = false) Double distance, @RequestParam (required = false) Double time) {
        if(distance == null || time == null) {
            return new ResponseEntity<>(new YonduError(), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new Yondu(distance, time), HttpStatus.OK);
        }
    }

    Rocket rocket = new Rocket();

    @GetMapping("rocket")
    public ResponseEntity<?> getRocket() {
        return new ResponseEntity<>(rocket, HttpStatus.OK);
    }

    @GetMapping("rocket/fill")
    public ResponseEntity<?> fillRocket(@RequestParam (required = false) String caliber, @RequestParam (required = false) Integer amount) {
        if(caliber == null || amount == null) {
            return new ResponseEntity<>(new RocketError(), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(rocketService.fill(rocket, caliber, amount), HttpStatus.OK);
        }
    }

}
