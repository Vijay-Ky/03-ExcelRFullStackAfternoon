package com.excelr.interfaces.app2;

class U
{
    void test1()
    {
        System.out.println("from test1()");
    }
}
interface V
{
    void test2();
}
interface W
{
    void test3();
}
interface X
{
    void test3();
}
class Y extends U implements V, W, X
{

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

    public static void main(String[] args)
    {
        Y y1 = new Y();
        y1.test1();
        y1.test2();
        y1.test3();
    }
}
