package com.excelr.spring.boot.aop.main.service;

import com.excelr.spring.boot.aop.main.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);

}
