package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.model.Groot;
import com.greenfoxacademy.groot.model.GrootError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping("groot")
    public ResponseEntity<?> groot(@RequestParam (required = false) String message) {
        if(message == null) {
            return new ResponseEntity<>(new GrootError(), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new Groot(message), HttpStatus.OK);
        }
    }

}
