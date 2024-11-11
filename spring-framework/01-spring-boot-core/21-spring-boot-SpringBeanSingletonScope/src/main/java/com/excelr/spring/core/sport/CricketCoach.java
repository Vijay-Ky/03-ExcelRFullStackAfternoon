package com.excelr.spring.core.sport;

import org.springframework.stereotype.Component;


@Component
public class CricketCoach implements Coach
{
    public CricketCoach()
    {
        System.out.println("From CricketCoach constructor: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout()
    {
        return "CricketCoach: Practice batting for 30 minutes";
    }
}