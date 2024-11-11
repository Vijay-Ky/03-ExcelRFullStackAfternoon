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
			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO)
	{
		//create the student objects
		System.out.println("Creating Multiple student objects ...");
		Student tempStudent1 = new Student("Aditi", "Sharma", "aditi@vijaysprogramming.com");
		Student tempStudent2 = new Student("Maya", "Arora", "maya@vijaysprogramming.com");
		Student tempStudent3 = new Student("Neha", "Patel", "neha@vijaysprogramming.com");

		//save the student object
		System.out.println("Saving student objects ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);


		//display id of the saved student
		System.out.println("Saved!  Generated ID: " + tempStudent1.getId());
		System.out.println("Saved!  Generated ID: " + tempStudent2.getId());
		System.out.println("Saved!  Generated ID: " + tempStudent3.getId());
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

