package com.excelr.spring.core.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController
{
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello from FunRestController";
    }

    @GetMapping("/bye")
    public String sayBye()
    {
        return "Hello from Say Bye";
    }

    @GetMapping("/welcome")
    public String sayWelcome()
    {
        return "Hello from Say Welcome";
    }
}
