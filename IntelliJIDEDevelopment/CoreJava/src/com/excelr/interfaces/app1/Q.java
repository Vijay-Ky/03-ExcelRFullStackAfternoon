package com.excelr.interfaces.app1;

interface Q
{
    void test1();
    void test2(int i);
    boolean test3(boolean b);
}
abstract class R implements Q
{
    @Override
    public void test1()
    {
        System.out.println("from test1()");
    }

    @Override
    public void test2(int i)
    {
        System.out.println("from test2(int)");
    }
}
class S extends R
{
    @Override
    public boolean test3(boolean b)
    {
        return b;
    }

    void test4()
    {
        System.out.println("from test4()");
    }

    public static void main(String[] args)
    {
        S s1 = new S();
        s1.test1();
        s1.test2(10);
        System.out.println(s1.test3(true));
        s1.test4();
    }
}
