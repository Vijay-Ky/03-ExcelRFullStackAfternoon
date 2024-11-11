package com.excelr.spring.boot.aop.main.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyAwesomeLoggingAspect
{
    @Before("com.excelr.spring.boot.aop.main.aspect.MyDemoLoggingAspect.forDaoPackageNoGetterSetter()")
    public void performAwesomeLoggingAspect()
    {
        System.out.println("\n=====>>> From MyAwesomeLoggingAspect order(1)");
    }
}

