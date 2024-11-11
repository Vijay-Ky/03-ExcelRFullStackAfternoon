package com.spring.mvc.crud.main.dao;
import com.spring.mvc.crud.main.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
}