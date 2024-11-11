package com.excelr.spring.boot.aop.main.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect
{
    //parameter type
    @Before("execution(* add*(com.excelr.spring.boot.aop.main.Account))")
    public void beforeAddAccountAdvice()
    {
        System.out.println("\n=====>>> Executing @Before advice on addAccount(Account)");
    }
}
