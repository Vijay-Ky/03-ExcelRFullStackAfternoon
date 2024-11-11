package com.excelr.spring.boot.aop.main.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyIncredibleLoggingAspect
{
    @Before("com.excelr.spring.boot.aop.main.aspect.MyDemoLoggingAspect.forDaoPackageNoGetterSetter()")
    public void performIncredibleLoggingAspect()
    {
        System.out.println("\n=====>>> From MyIncredibleLoggingAspect order(2)");
    }
}

