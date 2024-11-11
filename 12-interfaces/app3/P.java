package com.excelr.interfaces.app3;

interface P
{
    //from JDK 1.8 interfaces got added with the new feature that, interfaces can have any no. of static and default methods which are implemented.
    static void test1()
    {
        System.out.println("from test1()");
    }
    static void test2()
    {
        System.out.println("from test2()");
    }

    default void test3()
    {
        System.out.println("from P.test3()");
    }
    default void test4()
    {
        System.out.println("from P.test4()");
    }

    void test5();
}
class Q implements P
{
    @Override
    public void test3()
    {
        System.out.println("from Q.test3()");
    }

    @Override
    public void test4()
    {
        System.out.println("from Q.test4()");
    }

    @Override
    public void test5()
    {
        System.out.println("from test5()");
    }

    public static void main(String[] args)
    {
        Q q1 = new Q();
        q1.test3();
        q1.test4();
        q1.test5();

        System.out.println("-------------------------------");

        P.test1();
        P.test2();
    }
}
