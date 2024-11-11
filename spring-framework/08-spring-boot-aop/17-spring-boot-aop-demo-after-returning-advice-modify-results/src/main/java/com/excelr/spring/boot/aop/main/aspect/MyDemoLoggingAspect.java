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

    // create a pointcut for getter methods
    @Pointcut("execution(* com.excelr.spring.boot.aop.main.daoacc.*.get*(..))")
    private void getter() {}

    // create a pointcut for getter methods
    @Pointcut("execution(* com.excelr.spring.boot.aop.main.daoacc.*.set*(..))")
    private void setter() {}

    // create pointcut: include package ... exclude getter/setter
    //@Pointcut("forDaoAccPackage() && (getter() || setter())")
    @Pointcut("forDaoAccPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAccountMethods()
    {
        System.out.println("\n=====>>> Executing @Before advice on AccountMethods No getter and setter methods (* com.excelr.spring.boot.aop.main.daoacc.*.*(..))");
    }
}

//    @Pointcut("execution(* com.excelr.spring.boot.aop.main.daomem.*.*(..))")
//    private void forDaoMemPackage() {}

//    @Before("forDaoMemPackage()")
//    public void beforeMemberMethods()
//    {
//        System.out.println("\n=====>>> Executing @Before advice on MemberMethods (* com.excelr.spring.boot.aop.main.daomem.*.*(..))");
//    }

//    @Before("forDaoAccPackage()")
//    public void performApiAnalyticsDao()
//    {
//        System.out.println("\n=====>>> Performing API analytics on DAOAccount");
//    }
//    @Before("forDaoMemPackage()")
//    public void performApiAnalyticsDemo()
//    {
//        System.out.println("\n=====>>> Performing API analytics on DAOMember");
//    }
