package com.spring.data.jpa.main;

import com.spring.data.jpa.main.dao.StudentDAO;
import com.spring.data.jpa.main.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
			queryForStudentsByLastName(studentDAO);
		};
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Doe");

		// display list of students
		for (Student tempStudent : theStudents)
		{
			System.out.println(tempStudent);
		}
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

