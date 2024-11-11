package com.excelr.spring.boot.aop.main.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO
{
    @Override
    public int addAccount()
    {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
        return 100;
    }
}
