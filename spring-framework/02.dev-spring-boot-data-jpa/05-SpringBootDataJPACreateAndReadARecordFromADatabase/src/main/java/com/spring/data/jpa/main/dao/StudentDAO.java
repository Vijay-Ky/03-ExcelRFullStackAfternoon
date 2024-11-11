package com.spring.data.jpa.main.dao;

import com.spring.data.jpa.main.entity.Student;

public interface StudentDAO
{
    void save(Student theStudent);
    Student findById(Integer id);
}
