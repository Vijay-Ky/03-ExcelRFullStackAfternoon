package com.excelr.spring.core.sport;

import org.springframework.stereotype.Component;


public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "CricketCoach: Practice batting for 30 minutes";
    }
}
