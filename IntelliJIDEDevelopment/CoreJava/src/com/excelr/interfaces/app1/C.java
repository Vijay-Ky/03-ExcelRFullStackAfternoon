package com.excelr.interfaces.app1;

//interface can become a member of the java file
//for interface also javac compiler develops .class file
//in java file we can develop any no. of interfaces
//by default the members of an interface are public, static and final
//class HelloWorld
//{
//    public static void main(String[] args)
//    {
//        final int i = 10;
//        //i = 20;
//    }
//}
interface C
{
    //data members
    //modifier order doesn't matter you can keep in any order
    //public static final int i = 10;
    int i = 10;
    //public final static int j = 10;
    static int j = 10;
    //final static public int k = 10;
    public int k = 10;
    //public static final int l  10;
    final int l = 10;

    //what ever the normal method you are declaring inside the interface are by default abstract only
   //for all the normal methods or member functions compiler only keeps abstract and public, you can skip these modifiers.
    //in the abstract class we can only have abstract methods not the normal implemented methods
    //abstract public void test1();
    void test1();

    //abstract public void test2()
    public void test2();

    //public abstract void test3();
    abstract void test3();

    public abstract void test4();

    abstract public void test5();
}
