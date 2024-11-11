package com.excelr.spring.boot.aop.main.dao;

import com.excelr.spring.boot.aop.main.Account;
import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO
{
    @Override
    public boolean addSillyAccount(Account theAccount, String vipFlagValue)
    {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
        return false;
    }
}
