package com.example.springsecuritysection1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    /**
     *
     */
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the spring application with security";
    }




}
