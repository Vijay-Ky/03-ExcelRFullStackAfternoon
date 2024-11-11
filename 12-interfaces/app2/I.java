package com.excelr.interfaces.app2;

interface I
{
    void test1();
}
interface J
{
    void test2();
}
interface K
{
    void test3();
}
abstract class L implements I, J, K
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
}
class M extends L
{

    @Override
    public void test3()
    {
        System.out.println("from test3()");
    }

    public static void main(String[] args)
    {
        M m1 = new M();
        m1.test1();
        m1.test2();
        m1.test3();
    }
}
