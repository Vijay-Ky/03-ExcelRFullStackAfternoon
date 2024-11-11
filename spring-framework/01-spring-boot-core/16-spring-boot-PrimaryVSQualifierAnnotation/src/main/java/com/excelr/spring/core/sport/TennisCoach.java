package com.excelr.spring.core.sport;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return " TennisCoach: Practice smash for 20 minutes";
    }
}
