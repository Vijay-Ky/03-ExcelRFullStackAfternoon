package com.excelr.spring.core.rest;

import com.excelr.spring.core.sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController
{
    private Coach myCoach;

    //@Qualifier using if multiple implementation are there then we can specify the exact bean component we want to inject through @Qualifier annotation.
    //supply the class name in the form of first letter in the lower case.
    @Autowired
    public FunRestController(@Qualifier("swimmingCoach") Coach theCoach)
    {
        myCoach = theCoach;
        System.out.println("from constructor RestControllerProgram theCoach value " + myCoach );
    }

    @GetMapping("/john-workout")
    public String getAvailableDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
