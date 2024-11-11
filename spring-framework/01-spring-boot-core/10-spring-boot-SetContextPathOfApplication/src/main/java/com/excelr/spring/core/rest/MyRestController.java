package com.excelr.spring.core.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController
{
    //inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo()
    {
        return "Coach: " + coachName + ", Team Name: " + teamName;
    }

    @GetMapping("/")
    public String agileMethodology()
    {
        return "using Agile Methodology!!";
    }
}
