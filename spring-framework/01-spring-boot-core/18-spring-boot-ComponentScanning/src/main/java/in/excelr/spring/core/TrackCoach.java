package in.excelr.spring.core;

import com.excelr.spring.core.sport.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "TrackCoach: run for 4miles";
    }
}

