package com.spring.rest.crud.main.dao;


import com.spring.rest.crud.main.entity.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> findAll();

    Employee findById(int employeeId);

    Employee save(Employee theEmployee);

    void deleteById(int employeeId);
}

