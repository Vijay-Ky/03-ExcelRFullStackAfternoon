package com.excelr.finalkeyword.app1;

class A
{
    public static void main(String[] args)
    {
        int i = 10;
        //final keyword can be used along with static, non-static, local variables
        //in case of final variables values are fixed, it is similar to constant in c
        //we have const keyword in java but that has been deprecated instead we use final keyword
        //if you initialize a final variable with any value that is fixed, it cant be changed further.
        final int j = 20;

        System.out.println(i);
        System.out.println(j);

        i = 15;
        System.out.println(i);

//        j = 25;
    }
}
