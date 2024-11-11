package com.spring.mvc.crud.main.service;

import com.spring.mvc.crud.main.entity.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);
}