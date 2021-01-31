package com.greenfoxacademy.learningrest.contoller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.learningrest.service.LogService;
import com.greenfoxacademy.learningrest.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExercisesController {

    LogService logService;
    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    public ExercisesController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("doubling")
    public ResponseEntity<?> doubling(@RequestParam (required = false) Integer input) {
        logService.saveLog(new Log("/doubling", input.toString()));
        if(input == null) {
            return new ResponseEntity<>(new DoublingError(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new Doubling(input), HttpStatus.OK);
        }
    }

    @GetMapping("greeter")
    public ResponseEntity<?> greeting(@RequestParam (required = false) String name, @RequestParam (required = false) String title) {
        logService.saveLog(new Log("/greeter", "Name: " + name + ", Title: " + title));
        if(name == null && title == null) {
            return new ResponseEntity<>(new GreeterError("Please provide a name and a title!"), HttpStatus.BAD_REQUEST);
        } else if (name == null) {
            return new ResponseEntity<>(new GreeterError("Please provide a name!"), HttpStatus.BAD_REQUEST);
        } else if (title == null) {
            return new ResponseEntity<>(new GreeterError("Please provide a title!"), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new Greeter(name, title), HttpStatus.OK);
        }
    }

    @GetMapping("appenda/{appendable}")
    public ResponseEntity<?> appenda(@PathVariable String appendable) {
        logService.saveLog(new Log("/appenda", appendable));
        return new ResponseEntity<>(new AppendA(appendable), HttpStatus.OK);
    }

    @PostMapping("dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody Until until) {
        if (until == null) {
            return new ResponseEntity<>(new DoUntilError(), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new DoUntil(action, until.getUntil()), HttpStatus.OK);
        }
    }

    @PostMapping("arrays")
    public ResponseEntity<?> arrayHandler(@RequestBody WhatNumbers whatNumbers) throws Exception {
        logService.saveLog(new Log("/arrays", mapper.writeValueAsString(whatNumbers)));
        if(whatNumbers == null) {
            return new ResponseEntity<>(new WhatNumbersError(), HttpStatus.BAD_REQUEST);
        } else {
            if(whatNumbers.getWhat().equals("double")) {
                return new ResponseEntity<>(new ArrayHandlerArrayResult(whatNumbers.getWhat(), whatNumbers.getNumbers()), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(new ArrayHandler(whatNumbers.getWhat(), whatNumbers.getNumbers()), HttpStatus.OK);
            }
        }
    }

    @GetMapping("log")
    public ResponseEntity<?> log() {
        return new ResponseEntity<>(logService.getAllLogs(), HttpStatus.OK);
    }



}
