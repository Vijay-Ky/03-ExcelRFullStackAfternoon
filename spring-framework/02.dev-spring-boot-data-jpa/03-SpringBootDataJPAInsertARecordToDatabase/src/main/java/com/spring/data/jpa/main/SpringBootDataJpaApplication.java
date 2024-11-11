package com.spring.data.jpa.main;

import com.spring.data.jpa.main.dao.StudentDAO;
import com.spring.data.jpa.main.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO)
	{
		//create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Vijay", "Kumar", "vijay@vijaysprogramming.com");

		//save the student object
		System.out.println("Saving student object ...");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student, Generated ID: " + tempStudent.getId());
	}
}




//run this on command line
//
//
//
//CREATE USER 'SpringDataJpa'@'localhost' IDENTIFIED BY 'SpringDataJpa';
//
//GRANT ALL ON *.* TO 'SpringDataJpa'@'localhost';
//drop user pringDataJpa@localhost;

