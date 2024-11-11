package com.skshieldus.demo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class HelloController {

    @Value("${data.test}")
    String test;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, " + test + "!";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "Hello, " + test + "!";
    }


}
