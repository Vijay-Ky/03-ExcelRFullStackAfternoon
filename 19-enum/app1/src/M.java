package app1;

class M
{
    enum En
    {
        C1, C2, C3, C4;
    }
    enum Enum
    {
        T1, T2, T3, T4;
    }
    public static void main(String[] args)
    {
        En e1 = En.C4;
        System.out.println(e1);
        En e2 = En.C3;
        System.out.println(e2);
        System.out.println("-----------");
        Enum enum1 = Enum.T1;
        System.out.println(e1);
        Enum enum2 = Enum.T2;
        System.out.println(e2);
    }
}
//enum can become a member of the class also
//we can develop an enum inside a class as a member of the class
