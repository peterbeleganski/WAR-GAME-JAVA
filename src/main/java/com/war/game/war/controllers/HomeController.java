package com.war.game.war.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String greeting() {

        return "Hello Spring Boot";
    }
}
