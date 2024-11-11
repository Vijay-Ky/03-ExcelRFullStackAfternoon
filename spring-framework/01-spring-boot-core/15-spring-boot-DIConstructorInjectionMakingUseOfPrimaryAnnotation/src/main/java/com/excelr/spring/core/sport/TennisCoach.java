package com.excelr.spring.core.sport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TennisCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return " TennisCoach: Practice smash for 20 minutes";
    }
}
