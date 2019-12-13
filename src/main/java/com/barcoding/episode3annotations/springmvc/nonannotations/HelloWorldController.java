package com.barcoding.episode3annotations.springmvc.nonannotations;

import static spark.Spark.get;

public class HelloWorldController {
    public String helloWorld(){
        return "Hello World!";
    }
}
