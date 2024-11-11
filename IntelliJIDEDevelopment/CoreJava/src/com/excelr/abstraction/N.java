package com.excelr.abstraction;

abstract class N
{
   abstract void test1();
   abstract void test2();
   abstract void test3();
   abstract void test4();
}
abstract class O extends N
{
    @Override
    void test1()
    {
        System.out.println("from O-test1()");
    }
    abstract void test5();
}
class P extends O
{

    @Override
    void test2()
    {
        System.out.println("from P-test2()");
    }

    @Override
    void test3()
    {
        System.out.println("from P-test3()");
    }

    @Override
    void test4()
    {
        System.out.println("from P-test4()");
    }

    @Override
    void test5()
    {
        System.out.println("from P-test5()");
    }

    public static void main(String[] args)
    {
        P obj = new P();
        obj.test1();
        obj.test2();
        obj.test3();
        obj.test4();
        obj.test5();
        System.out.println("done");
    }
}
class Q extends N
{

    @Override
    void test1()
    {

    }

    @Override
    void test2()
    {

    }

    @Override
    void test3()
    {

    }

    @Override
    void test4()
    {

    }
}
