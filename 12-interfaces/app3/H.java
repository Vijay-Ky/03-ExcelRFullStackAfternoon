package com.excelr.interfaces.app3;

interface H
{
    void test1();
}
interface I
{
    void test2();
}
interface J extends H, I
{
    void test3();
}
interface K
{
    void test4();
}
class L
{
    void test5()
    {
        System.out.println("from test5()");
    }
}
class M extends L implements J, K
{

    @Override
    public void test1()
    {
        System.out.println("from test1()");
    }

    @Override
    public void test2()
    {
        System.out.println("from test2()");
    }

    @Override
    public void test3()
    {
        System.out.println("from test3()");
    }

    @Override
    public void test4()
    {
        System.out.println("from test4()");
    }

    public static void main(String[] args)
    {
        M m1 = new M();
        m1.test1();
        m1.test2();
        m1.test3();
        m1.test4();
    }
}

//class A
//{}
//class B extends A{}
//class C extends A{}
