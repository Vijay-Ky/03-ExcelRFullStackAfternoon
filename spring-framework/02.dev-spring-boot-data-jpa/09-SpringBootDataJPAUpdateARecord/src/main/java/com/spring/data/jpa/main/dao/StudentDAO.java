package com.spring.data.jpa.main.dao;

import com.spring.data.jpa.main.entity.Student;

public interface StudentDAO
{
    Student findById(Integer id);

    void update(Student theStudent);
}
