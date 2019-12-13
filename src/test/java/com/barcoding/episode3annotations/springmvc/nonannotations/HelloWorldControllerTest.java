package com.barcoding.episode3annotations.springmvc.nonannotations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldControllerTest {

    @Test
    void helloWorld() {
        String result = new HelloWorldController().helloWorld();
        assertThat(result).isEqualTo("Hello World!");
    }
}
