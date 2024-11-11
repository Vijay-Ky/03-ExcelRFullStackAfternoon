package com.excelr.interfaces.app1;

interface O
{
    void test1();
    int test2(int i);
}
//class to interface - implements
class P implements O
{
    @Override
    public void test1()
    {
        System.out.println("from test1()");
    }

    @Override
    public int test2(int i)
    {
        System.out.println("from test2(int)");
        return 0;
    }

    public static void main(String[] args)
    {
        P p1 = new P();
        p1.test1();
        p1.test2(10);
    }
}
