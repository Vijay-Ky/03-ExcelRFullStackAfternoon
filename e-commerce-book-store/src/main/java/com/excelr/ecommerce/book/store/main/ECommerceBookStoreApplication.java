package com.excelr.ecommerce.book.store.main;

import com.excelr.ecommerce.book.store.main.dao.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceBookStoreApplication {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ECommerceBookStoreApplication.class, args);
	}

}
