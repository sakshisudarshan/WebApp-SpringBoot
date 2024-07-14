package com.sakshisudarshan.SimpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Sakshi's page!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Pro in java and springboot...";
    }
}
