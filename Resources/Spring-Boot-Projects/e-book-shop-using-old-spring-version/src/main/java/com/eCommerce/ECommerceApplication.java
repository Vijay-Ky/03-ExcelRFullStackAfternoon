package com.eCommerce;

import com.eCommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ECommerceApplication// implements CommandLineRunner
{
	@Autowired
	private UserService userService;

	public static void main(String[] args)
	{
		SpringApplication.run(ECommerceApplication.class, args);
	}
}
