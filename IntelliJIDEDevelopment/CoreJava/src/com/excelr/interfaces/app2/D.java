package com.excelr.interfaces.app2;

interface D
{
    void test1();
}
interface E
{
    void test2();
}
interface F
{
    void test3();
}
interface G
{
    void test4();
}
class H implements D, E, F, G
{

    @Override
    public void test1()
    {
        System.out.println("test1()");
    }

    @Override
    public void test2()
    {
        System.out.println("test2()");
    }

    @Override
    public void test3()
    {
        System.out.println("test3()");
    }

    @Override
    public void test4()
    {
        System.out.println("test4()");
    }

    public static void main(String[] args)
    {
        H h1 = new H();
        h1.test1();
        h1.test2();
        h1.test3();
        h1.test4();
    }
}
