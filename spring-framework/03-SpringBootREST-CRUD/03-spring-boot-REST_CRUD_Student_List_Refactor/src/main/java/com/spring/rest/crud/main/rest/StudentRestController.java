package com.spring.rest.crud.main.rest;

import com.spring.rest.crud.main.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController
{
    private List<Student> theStudents;


    //define @PostConstruct to load the student data ... only once!
    //This is much better since we load student data only once
    //@PostConstruct is an annotation from the Java Persistence API (JPA) that is used in Spring (including Spring Boot) to indicate a method that should be executed after a bean has been constructed and initialized.
    @PostConstruct
    public void loadData()
    {
        theStudents = new ArrayList<Student>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
        theStudents.add(new Student());
    }

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return theStudents;
    }
}
