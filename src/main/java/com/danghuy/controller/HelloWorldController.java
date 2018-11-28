package com.danghuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String printHelloWorld(Model model){
        model.addAttribute("greeting", "Hello Spring MVC!");
        return "helloworld";
    }
}
