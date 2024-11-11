package com.excelr.spring.boot.aop.main.aspect;

import com.excelr.spring.boot.aop.main.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.AfterReturning;

import java.util.List;

//if you only have pointcuts then @Aspect is optional. only required if you add advices in this class: @Before, @After
@Aspect
@Component
@Order(0)
public class JointPointAspect
{
    // add a new advice for @AfterReturning on the findAccounts method

    @AfterReturning(
            pointcut = "execution(* com.excelr.spring.boot.aop.main.daoacc.AccountDAO.doWork(..))",
            returning = "result")
    public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {

        // print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);

        // print out the results of the method call
        System.out.println("\n=====>>> result is: " + result);
    }


    @Before("com.excelr.spring.boot.aop.main.aspect.MyDemoLoggingAspect.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint)
    {
        System.out.println("\n=====>>> Executing JointPointAspect class @Before advice on method ");

        // display the method signature
        MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();

        System.out.println("Method::::::::::::::::::: " + methodSignature);

        // display method arguments

        // get args
        //returns an array of arguments
        Object[] args = theJoinPoint.getArgs();

        // loop through args
        //Object obj = new Account();
        //  Account ref = (Account) obj;
        //Employee();

        for (Object tempArg : args)
        {
            System.out.println(tempArg);

            if (tempArg instanceof Account)
            {
                // downcast and print Account specific stuff
                Account theAccount = (Account) tempArg;

                System.out.println("account name: " + theAccount.getName());
                System.out.println("account level: " + theAccount.getLevel());
            }
        }
    }
}
/*
Reading Method Arguments with JoinPoints
 */

