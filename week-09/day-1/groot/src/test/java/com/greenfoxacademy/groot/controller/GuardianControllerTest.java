package com.greenfoxacademy.groot.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
@AutoConfigureMockMvc
public class GuardianControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void canWork() throws Exception {
        mockMvc.perform(get("/groot").param("message", "message"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("received", is("message")))
                .andExpect(jsonPath("translated", is("I am a groot!")));
    }

    @Test
    public void cantWork() throws Exception {
        String nullString = null;
        mockMvc.perform(get("/groot").param("message", nullString))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("I am Groot!")));
    }

}
