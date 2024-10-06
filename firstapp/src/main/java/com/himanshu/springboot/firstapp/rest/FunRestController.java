package com.himanshu.springboot.firstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" endpoint and return "hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Namaste Duniyaaaaaa ! !!";
    }
    // exposing endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a Hard 5K!!!";
    }
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day.";
    }


}
