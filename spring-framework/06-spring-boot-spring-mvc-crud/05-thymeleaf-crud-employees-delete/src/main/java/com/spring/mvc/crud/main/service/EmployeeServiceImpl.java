package com.spring.mvc.crud.main.service;

import com.spring.mvc.crud.main.dao.EmployeeRepository;
import com.spring.mvc.crud.main.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId)
    {
        Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee = null;

        if(result.isPresent())
        {
            theEmployee = result.get();
        }
        else
        {
            //we didnt find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee)
    {
        employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId)
    {
        employeeRepository.deleteById(theId);
    }
}

