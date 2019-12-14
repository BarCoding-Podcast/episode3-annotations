package com.barcoding.episode3annotations.springmvc.annotations;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @RequestMapping("/hello")
  private String helloWorld() {
    return "Hello world!";
  }
}
