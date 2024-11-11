package com.excelr.asserstions.pack1;

class K
{
    public static void main(String[] args)
    {
        System.out.println("main begin");
       assert true : test();
        System.out.println("main end");
    }
    public static int test()
    {
        return 100;
    }
}
