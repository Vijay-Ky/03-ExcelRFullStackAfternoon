package com.excelr.abstraction;

abstract class S
{
    S()
    {
        System.out.println("S()");
    }
}
class T extends S
{
    T()
    {
        System.out.println("T()");
    }

    public static void main(String[] args)
    {
        T t1 = new T();
        System.out.println("done");
    }
}
