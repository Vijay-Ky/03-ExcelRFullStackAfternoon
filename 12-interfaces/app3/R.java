package com.excelr.interfaces.app3;
//inside the interface static methods are not involving in polymorphism(overriding)
interface R
{
    static void test1()
    {
        System.out.println("from test1()");
    }
    default void test2()
    {
        System.out.println("from test2()");
    }
    void test3();
}
class S implements R
{
    public static void main(String[] args)
    {
        S s1 = new S();
        s1.test2();
        R.test1();
    }

    @Override
    public void test3()
    {

    }
}
