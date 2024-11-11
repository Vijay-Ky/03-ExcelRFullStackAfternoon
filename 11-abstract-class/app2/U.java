package com.excelr.abstraction;

abstract class U
{
    U(int i)
    {
        System.out.println("U(int)");
    }
    abstract void test1();
}
abstract class V extends U
{
    V()
    {
        super(0);
        System.out.println("V()");
    }
}
class W extends V
{
    W()
    {
        System.out.println("W()");
    }

    @Override
    void test1()
    {
        System.out.println("W.test1()");
    }

    public static void main(String[] args)
    {
        W w1 = new W();
        System.out.println("---------");
        w1.test1();
        System.out.println("done");
    }
}
