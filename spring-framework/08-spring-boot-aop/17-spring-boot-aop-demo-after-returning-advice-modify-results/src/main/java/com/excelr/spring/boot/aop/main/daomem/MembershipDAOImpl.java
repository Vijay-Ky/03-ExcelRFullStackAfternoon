package com.excelr.spring.boot.aop.main.daomem;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO
{
    @Override
    public boolean addSillyAccount(String str1, String str2)
    {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT addSillyAccount(String, String)");
        return false;
    }

    @Override
    public void veryImportantAccount(int i, double j)
    {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT veryImportantAccount(int, double)");
    }

    @Override
    public void goToSleep()
    {
        System.out.println(getClass() + ": I'm going to sleep now...");
    }
}