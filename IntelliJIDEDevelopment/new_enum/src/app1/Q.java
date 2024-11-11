package app1;

class Q
{
    enum En
    {
        C1, C2, C3, C4;
    }
}
class R
{
    public static void main(String[] args)
    {
        //En should be refered through Q
        //its like inner class
        Q.En e1 = Q.En.C4;
        Q.En e2 = Q.En.C2;
        System.out.println(e1);
        System.out.println(e2);
    }
}
