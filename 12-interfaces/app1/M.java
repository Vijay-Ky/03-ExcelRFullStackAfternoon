package com.excelr.interfaces.app1;

interface M
{
    void test1();
}
//class to class extends
//class to interface implements
class N implements M
{
    @Override
    public void test1()
    {
        System.out.println("from N.test1()");
    }

    public static void main(String[] args)
    {
        //for the interface we cant create an object
        //M m1 = new M();
        M m1 = null;
        M obj = (M)new N();
        N n1 = new N();
        obj.test1();
        n1.test1();
        System.out.println("done");
    }
}