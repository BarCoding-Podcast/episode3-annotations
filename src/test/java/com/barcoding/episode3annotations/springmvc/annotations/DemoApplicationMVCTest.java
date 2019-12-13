package com.barcoding.episode3annotations.springmvc.annotations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.http.server.reactive.MockServerHttpRequest;
import org.springframework.test.web.servlet.MockMvc;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest
public class DemoApplicationMVCTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getHello() throws Exception {

        mvc.perform(get("/hello"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello world!"));
    }

    @Test
    public void getHelloBarcoding() throws Exception {
        mvc.perform(get("/helloBarCoding"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello BarCoding!"));
    }

}
