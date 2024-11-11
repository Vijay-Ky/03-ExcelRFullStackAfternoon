package com.excelr.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.excelr.spring.core", "in.excelr.spring.core"})
public class SpringCoreApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringCoreApplication.class, args);
		System.out.println("From Spring Main class");
	}

}
