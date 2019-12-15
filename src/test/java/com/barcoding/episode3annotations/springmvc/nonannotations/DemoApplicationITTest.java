package com.barcoding.episode3annotations.springmvc.nonannotations;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import spark.Spark;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DemoApplicationITTest {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final int PORT = 8888;

    @BeforeEach
    void init(){
        DemoApplication.main(null);
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = restTemplate.getForEntity(
            new URL("http://localhost:" + PORT + "/hello").toString(), String.class);
        assertEquals("Hello World!", response.getBody());
    }

    @Test
    public void getHelloBarCoding() throws Exception {
        ResponseEntity<String> response = restTemplate.getForEntity(
            new URL("http://localhost:" + PORT + "/helloBarCoding").toString(), String.class);
        assertEquals("Hello Barcoding!", response.getBody());

    }

    @AfterEach
    void shutDown(){
        Spark.stop();
        Spark.awaitStop();
    }

}
