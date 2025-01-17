package com.spring.mvc.main.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController
{
    // need a controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm()
    {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm()
    {
        return "helloworld";
    }

    //need a controller method to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String readOut(HttpServletRequest request, Model model)
    {
        //read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        //convert the data to uppercase
        theName = theName.toUpperCase();

        //create the message
        String result = "Reading Out The Name: " + theName;

        //add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}

