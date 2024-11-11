package com.excelr.spring.core.config;
import com.excelr.spring.core.sport.Coach;
import com.excelr.spring.core.sport.TennisCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig
{
    @Bean("tennisConfiguration")
    public Coach tennisCoach()
    {
        return new TennisCoach();
    }
}
