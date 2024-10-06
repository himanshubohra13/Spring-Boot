package com.learningjava.springcorelearn;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Practice you backhand volley";
    }
}
