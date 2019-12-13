package com.barcoding.episode3annotations.springmvc.nonannotations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloBarCodingControllerTest {
    @Test
    void helloWorld() {
        String result = new HelloBarCodingController().helloBarCoding();
        assertThat(result).isEqualTo("Hello Barcoding!");
    }
}
