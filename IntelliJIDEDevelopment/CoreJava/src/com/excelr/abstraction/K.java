package com.excelr.abstraction;

abstract class K
{
    abstract void test1();
    abstract void test2();
    void test3()
    {
        System.out.println("from test3()");
    }
}
abstract class L extends K
{
    @Override
    void test1()
    {
        System.out.println("from test1()");
    }
}
class M extends L
{
    @Override
    void test2()
    {
        System.out.println("from test2()");
    }

    public static void main(String[] args)
    {
        M obj = new M();
        obj.test1();
        obj.test2();
        obj.test3();
        System.out.println("done");
    }
}
