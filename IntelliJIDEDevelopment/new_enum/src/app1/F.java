package app1;

enum Enum1
{
    C1, C2, C3, C4;
}
class F
{
    public static void main(String[] args)
    {
        System.out.println(Enum1.C1);
        System.out.println(Enum1.C3);
    }
}
/*
- by using enum reference we can access enum constants.
 */
