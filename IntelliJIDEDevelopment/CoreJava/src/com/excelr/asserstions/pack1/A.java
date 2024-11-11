package com.excelr.asserstions.pack1;

public class A
{
    public static void main(String[] args)
    {
        System.out.println("begin");
        assert false;
        System.out.println("end");
    }
}
/*
* assert is a keyword that got introduced in java JDK 1.4
* assertion helps developers catch logical errors during development and testing phases
* by using assertion we are making statement that "I believe this condition should always be true at this point in my code" if the condition is false, it means there is a bug in the program
* assertions are particularly useful for debugging and testing purposes. they provide a way to detect and handle unexpected conditions early in the development process.
* By default assertions are disabled for performance reasons
* in simple words, whenever a business logic fails we can raise AssertionError
*
* 2 types of assert statements
   1.VSA (very simple assert statement)
     assert boolean_result;
   2.SA(simple assert statement)
     assert boolean_result:some_message;
* */