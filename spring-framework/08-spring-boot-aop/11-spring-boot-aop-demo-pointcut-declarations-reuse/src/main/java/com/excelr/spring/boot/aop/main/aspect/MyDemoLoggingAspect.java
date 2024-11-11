package com.excelr.spring.boot.aop.main.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect
{
    @Pointcut("execution(* com.excelr.spring.boot.aop.main.daoacc.*.*(..))")
    private void forDaoAccPackage() {}

    @Pointcut("execution(* com.excelr.spring.boot.aop.main.daomem.*.*(..))")
    private void forDaoMemPackage() {}

    @Before("forDaoAccPackage()")
    public void beforeAccountMethods()
    {
        System.out.println("\n=====>>> Executing @Before advice on AccountMethods (* com.excelr.spring.boot.aop.main.daoacc.*.*(..))");
    }

    @Before("forDaoMemPackage()")
    public void beforeMemberMethods()
    {
        System.out.println("\n=====>>> Executing @Before advice on MemberMethods (* com.excelr.spring.boot.aop.main.daomem.*.*(..))");
    }

    @Before("forDaoAccPackage()")
    public void performApiAnalyticsDao() {
        System.out.println("\n=====>>> Performing API analytics on DAOAccount");
    }
    @Before("forDaoMemPackage()")
    public void performApiAnalyticsDemo() {
        System.out.println("\n=====>>> Performing API analytics on DAOMember");
    }
}
