package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NetworkController {
    @GetMapping("/helloWorld")
    public String getHelloWorld() {
        return "Hello World";
    }
    
}
