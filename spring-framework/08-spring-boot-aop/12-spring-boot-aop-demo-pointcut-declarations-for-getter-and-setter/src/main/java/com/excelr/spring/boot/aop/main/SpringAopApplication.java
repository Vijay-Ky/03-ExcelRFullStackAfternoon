package com.excelr.spring.boot.aop.main;

import com.excelr.spring.boot.aop.main.daoacc.AccountDAO;
import com.excelr.spring.boot.aop.main.daomem.MembershipDAO;
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
		//Account myAccount = new Account();
		theAccountDAO.addAccount("vijay", "kumar");
		theAccountDAO.doWork();

		// call the accountdao getter/setter methods
		theAccountDAO.setName("vijay");
		theAccountDAO.setServiceCode("training");

		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();

		// call the business method again
		theMembershipDAO.addSillyAccount("excelr", "btm");
		theMembershipDAO.goToSleep();
		theMembershipDAO.veryImportantAccount(10, 20.0);

		System.out.println("---------------------------" + name);
		System.out.println("---------------------------" + (code));
	}

}