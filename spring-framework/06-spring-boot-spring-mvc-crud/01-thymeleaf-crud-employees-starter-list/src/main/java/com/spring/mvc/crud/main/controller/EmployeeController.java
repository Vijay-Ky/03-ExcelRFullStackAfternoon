package com.spring.mvc.crud.main.controller;

import com.spring.mvc.crud.main.entity.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController
{
    //load employee data
    private List<Employee> theEmployees;

    @PostConstruct
    private void loadData()
    {
        //create employees
        Employee emp1 = new Employee("John", "Andrews", "john@vp.com");
        Employee emp2 = new Employee("David", "Goodman", "david@vp.com");
        Employee emp3 = new Employee("Lesley", "Watson", "lesley@vp.com");

        //create the list
        theEmployees = new ArrayList<>();

        //add to the list
        theEmployees.add(emp1);
        theEmployees.add(emp2);
        theEmployees.add(emp3);
    }

    //add mapping for "/list"
    @GetMapping("/list")
    public String listEmployees(Model theModel)
    {
        //add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "list-employees";
    }
}
