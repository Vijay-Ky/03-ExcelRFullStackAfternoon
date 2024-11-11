package app1;

import java.lang.reflect.Method;
class Example
{
    public static void main(String[] args) throws Exception
    {
        int count = 0;
        Class c1 = Class.forName("app1.Month");
        Method[] m1 = c1.getDeclaredMethods();
        for(Method method : m1)
        {
            count++;
            System.out.println(method.getName());
        }
        System.out.println("The Number of methods: " + count);
    }
}

