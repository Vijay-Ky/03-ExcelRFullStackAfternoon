package com.excelr.spring.core.sport;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach
{
    public SwimmingCoach()
    {
        System.out.println("From constructor: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout()
    {
        return "SwimmingCoach: Practice diving for 20 minutes";
    }
}
