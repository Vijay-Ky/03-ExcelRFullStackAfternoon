package com.spring.rest.crud.main.service;

import com.spring.rest.crud.main.dao.EmployeeRepository;
import com.spring.rest.crud.main.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    //define field for entityManager
    private EmployeeRepository employeeRepository;

    //set up constructor injection
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

        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else
        {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theEmployee;
    }

    //@Transactional, remove this: since JpaRepository provides this implicitely
    @Override
    public Employee save(Employee theEmployee) {

        return employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId)
    {
        employeeRepository.deleteById(theId);
    }
}

