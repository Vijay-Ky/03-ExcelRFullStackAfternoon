package app3;

//EnumSet is a part of java.util
import java.util.EnumSet;

enum B
{
    ABC, XYZ, TEST;
}
class A
{
    public static void main(String[] args)
    {
        //EnumSet is an abstract class
        //EnumSet used for making a group of few constants of an enum or all constants of an enum
        //EnumSet is introduced to store one enum constant or all enum constant
        EnumSet<B> set = EnumSet.of(B.ABC, B.XYZ, B.TEST);
        for(B b1 : set)
        {
            System.out.println(b1);
        }
    }
}
/*
EnumSet is used to group few or all constants of an enum
*/

