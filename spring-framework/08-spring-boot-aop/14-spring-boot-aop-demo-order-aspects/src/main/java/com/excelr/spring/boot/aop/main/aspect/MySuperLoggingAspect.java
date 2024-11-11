package com.excelr.spring.boot.aop.main.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MySuperLoggingAspect
{
    @Before("com.excelr.spring.boot.aop.main.aspect.MyDemoLoggingAspect.forDaoPackageNoGetterSetter()")
    public void performSuperLoggingAspect()
    {
        System.out.println("\n=====>>> From MySuperLoggingAspect order(3)");
    }
}
