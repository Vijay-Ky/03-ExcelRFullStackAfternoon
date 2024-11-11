package com.excelr.interfaces.app3;

interface D
{
    void test1();
}
interface E
{
    void test2();
}
//one interface can extend more than one interface at a time
interface F extends D, E
{
    void test3();
}
class G implements F
{

    @Override
    public void test1()
    {
        System.out.println("from test1()");
    }

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
        G g1 = new G();
        g1.test1();
        g1.test2();
        g1.test3();
    }
}
