package com.greenfoxacademy.yondu.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
//@WebMvcTest(MainController.class)
@AutoConfigureMockMvc
@SpringBootTest
public class ControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void yonduCanWork() throws Exception {
        mockMvc.perform(get("/yondu").param("distance", "100.0").param("time", "10.0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("distance", is(100.0)))
                .andExpect(jsonPath("time", is(10.0)))
                .andExpect(jsonPath("speed", is(10.0)));
    }

    @Test
    public void yonduParametersNull() throws Exception {
        String empty = null;
        mockMvc.perform(get("/yondu").param("distance", empty).param("time", empty))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("Error! The distance or the time is missing!")));
    }

    @Test
    public void rocketCanWork() throws Exception {
        mockMvc.perform(get("/rocket"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("caliber25", is(0)))
                .andExpect(jsonPath("caliber30", is(0)))
                .andExpect(jsonPath("caliber50", is(0)))
                .andExpect(jsonPath("shipStatus", is("empty")))
                .andExpect(jsonPath("ready", is(false)));
    }

    @Test
    public void rocketCanFill() throws Exception {
        mockMvc.perform(get("/rocket/fill").param("caliber", ".50").param("amount", "5000"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("caliber25", is(0)))
                .andExpect(jsonPath("caliber30", is(0)))
                .andExpect(jsonPath("caliber50", is(5000)))
                .andExpect(jsonPath("shipStatus", is("40%")))
                .andExpect(jsonPath("ready", is(false)));
    }

    @Test
    public void rocketParamsNull() throws Exception {
        String empty = null;
        mockMvc.perform(get("/rocket/fill").param("caliber", empty).param("amount", empty))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("Error!")));
    }

}
