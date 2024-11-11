package com.excelr.spring.core.rest;

import com.excelr.spring.core.sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController
{
    private Coach myCoach;


    @Autowired
    public MyRestController(@Qualifier("trackCoach") Coach theCoach)
    {
        System.out.println("From MyRestController constructor: " + getClass().getSimpleName());
        myCoach = theCoach;

    }


    @GetMapping("/workout")
    public String getAvailableDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
