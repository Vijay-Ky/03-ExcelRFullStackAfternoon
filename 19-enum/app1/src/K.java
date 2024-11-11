package app1;

enum K
{
    T1, T2, T3, T4;
}
class L
{
    public static void main(String[] args)
    {
        K k1 = K.T3;
        System.out.println(k1);
        k1 = K.T4;
        System.out.println(k1);
        //while accessing from the enum that constant should be
        //available in the enum
        //k1 = K.T5;
        //System.out.println(k1);
    }
}
//by using enum name, we can access only available constant of the same enum.