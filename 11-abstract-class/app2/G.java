package com.excelr.abstraction;

abstract class G
{
    abstract void test1();
    void test2()
    {
        System.out.println("from test2()");
    }
}
class H extends G
{
    @Override
    void test1()
    {
        System.out.println("overriden/define method H.test1()");
    }

    public static void main(String[] args)
    {
        //we can create a reference of an abstract class
        G g1 = new H();
        g1.test1();
        g1.test2();
        System.out.println("------------------------");
        //for the abstract we cant create an object
      //G obj = new G();
        H object = new H();
        object.test1();
        object.test2();

    }
}
