package com.spring.rest.crud.main.rest;

import com.spring.rest.crud.main.dao.EmployeeDAO;
import com.spring.rest.crud.main.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController
{
    private EmployeeDAO employeeDAO;

    //quick way to inject employee DAO(using the constructor injection

    public EmployeeRestController(EmployeeDAO employeeDAO)
    {
        this.employeeDAO = employeeDAO;
    }

    //expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeDAO.findAll();
    }
}
