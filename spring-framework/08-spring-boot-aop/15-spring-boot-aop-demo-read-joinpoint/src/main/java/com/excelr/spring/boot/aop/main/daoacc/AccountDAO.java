package com.excelr.spring.boot.aop.main.daoacc;

public interface AccountDAO
{
    void addAccount(String str1, String str2);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);
}

