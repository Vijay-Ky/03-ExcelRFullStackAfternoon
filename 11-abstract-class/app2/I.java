package com.excelr.abstraction;

abstract class I
{
    abstract void test1();
    abstract void test2();
    abstract void test3();
}
class J extends I
{

    @Override
    void test1()
    {
        System.out.println("from test1()");
    }

    @Override
    void test2()
    {
        System.out.println("from test2()");
    }

    @Override
    void test3()
    {
        System.out.println("from test3()");
    }

    public static void main(String[] args)
    {
        J obj = new J();
        obj.test1();
        obj.test2();
        obj.test3();
        System.out.println("done");
    }
}
