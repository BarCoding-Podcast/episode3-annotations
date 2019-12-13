package com.barcoding.episode3annotations.springmvc.annotations;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBarCodingController {

    @RequestMapping("/helloBarCoding")
    private String helloWorld(){
        return "Hello BarCoding!";
    }
}
