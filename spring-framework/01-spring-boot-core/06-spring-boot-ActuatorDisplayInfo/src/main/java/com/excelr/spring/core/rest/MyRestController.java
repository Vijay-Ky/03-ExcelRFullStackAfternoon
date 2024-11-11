package com.excelr.spring.core.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController
{
    @GetMapping("/")
    public String Movies()
    {
        return "List of Movies";
    }

    @GetMapping("/batman")
    public String Batman()
    {
        return "Batman Movie";
    }

    @GetMapping("/inception")
    public String Inception()
    {
        return "Inception Movie";
    }

    @GetMapping("/ring")
    public String Ring()
    {
        return "The ring Movie";
    }

    @GetMapping("/fightclub")
    public String Fightclub()
    {
        return "Fightclub Movie";
    }
}
