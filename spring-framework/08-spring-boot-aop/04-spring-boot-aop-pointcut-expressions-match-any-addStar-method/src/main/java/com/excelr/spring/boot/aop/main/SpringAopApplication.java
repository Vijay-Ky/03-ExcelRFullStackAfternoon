package com.excelr.spring.boot.aop.main;

import com.excelr.spring.boot.aop.main.dao.AccountDAO;
import com.excelr.spring.boot.aop.main.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAopApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		return runner -> {

			demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO)
	{
		// call the business method
		theAccountDAO.addAccount();

		// call the business method again
		theMembershipDAO.addAccount();
	}

}
