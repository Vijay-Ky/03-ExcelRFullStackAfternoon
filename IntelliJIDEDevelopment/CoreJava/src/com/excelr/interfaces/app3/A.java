package com.excelr.interfaces.app3;

interface A
{
    void test1();
}
//class - class is extends
//interface - interface is extends
//class - interface is implements
interface B extends A
{
    void test2();
}
class C implements B
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

    public static void main(String[] args)
    {
        C c1 = new C();
        c1.test1();
        c1.test2();
    }
}
