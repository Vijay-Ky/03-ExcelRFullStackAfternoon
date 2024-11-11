package com.excelr.asserstions.pack1;

class M
{
    public static void main(String[] args)
    {
        System.out.println("main begin");
        assert false : test();
        System.out.println("main end");
    }
    public static M test()
    {
        M m1 = new M();
        return m1;
    }
}
