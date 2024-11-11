package com.excelr.interfaces.app3;

interface N
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
        System.out.println("from N-test3()");
    }
    default void test4()
    {
        System.out.println("from N-test4()");
    }

    void test5();
}
class O implements N
{

    @Override
    public void test5()
    {
        System.out.println("from test5()");
    }

    public static void main(String[] args)
    {
        O o1 = new O();
        o1.test3();
        o1.test4();
        o1.test5();
    }
}
