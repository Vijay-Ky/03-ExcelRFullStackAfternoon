package com.spring.rest.crud.main.rest;

import com.spring.rest.crud.main.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController
{
    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        List<Student> theStudents = new ArrayList<Student>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
        theStudents.add(new Student());

        return theStudents;
    }
}
