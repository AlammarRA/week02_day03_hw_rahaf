package com.example.week02_day03_hw_rahafalammar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping(path = "/hey")
    public String Message1(){
        return "Hey from spring";
    }

    @RequestMapping(path = "/bye", method = RequestMethod.GET)
    public String Message2(){
        return "Bye";
    }

    @RequestMapping(path = "/check/status", method = RequestMethod.GET)
    public String Message3(){
        return "Everything OK";
    }

    @RequestMapping(path = "/health", method = RequestMethod.GET)
    public String Message4(){
        return "Server health is up and running";
    }
}
