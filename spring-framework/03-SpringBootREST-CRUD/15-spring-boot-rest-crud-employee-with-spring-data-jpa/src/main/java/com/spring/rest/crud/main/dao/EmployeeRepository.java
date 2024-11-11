package com.spring.rest.crud.main.dao;

import com.spring.rest.crud.main.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    //no need to write any code, it will be taken care by the JpaRepository
}
