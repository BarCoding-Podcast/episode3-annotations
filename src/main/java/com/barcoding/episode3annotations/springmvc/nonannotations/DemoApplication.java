package com.barcoding.episode3annotations.springmvc.nonannotations;

import spark.Spark;


public class DemoApplication {
    public static void main(String[] args) {
        Spark.port(8888);
        HelloWorldController helloController = new HelloWorldController();
        HelloBarCodingController helloBarCodingController = new HelloBarCodingController();
        Spark.get("/hello", (req, res) -> helloController.helloWorld());
        Spark.get("/helloBarCoding", (req, res) -> helloBarCodingController.helloBarCoding());
        Spark.awaitInitialization();
    }
}
