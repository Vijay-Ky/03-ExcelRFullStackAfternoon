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
    private Coach myAnotherCoach;

    @Autowired
    public MyRestController(@Qualifier("cricketCoach") Coach theCoach,
                                 @Qualifier("cricketCoach") Coach theAnotherCoach)

    {
        System.out.println("From MyRestController constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        myAnotherCoach = theAnotherCoach;
    }

    //checking bean scopes
    @GetMapping("/checkScope")
    public String checkBeanScopes()
    {
        return "comparing bean: myCoach == myAnotherCoach "  + (myCoach == myAnotherCoach);
    }


    @GetMapping("/workout")
    public String getAvailableDailyWorkout()
    {
        return myCoach.getDailyWorkout() + "<br/>" + myAnotherCoach.getDailyWorkout();
    }
}

//to check both the references are referring to the same bean
//check to see if this is the same bean
//True or False depending on the bean scope
//singleton:true
//prototype:false
//you will get comparing bean: myCoach == myAnotherCoach, true
//checks to see if this is the same bean
//by default singleton scope.. hence true
