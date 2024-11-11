package com.excelr.spring.boot.aop.main.dao;

import com.excelr.spring.boot.aop.main.Account;

public interface MembershipDAO
{
    boolean addSillyAccount(Account theAccount, String vipFlagValue);
}
