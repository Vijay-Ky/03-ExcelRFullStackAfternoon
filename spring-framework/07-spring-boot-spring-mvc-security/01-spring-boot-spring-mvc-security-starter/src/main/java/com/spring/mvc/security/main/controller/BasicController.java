package com.spring.mvc.security.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController
{
    @GetMapping("/")
    public String showHome()
    {
        return "home";
    }
}

