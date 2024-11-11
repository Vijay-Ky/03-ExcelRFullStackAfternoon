package com.spring.data.jpa.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args)
	{
		return runner -> {
			System.out.println("Hello From CommandLineRunner");
		};
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

