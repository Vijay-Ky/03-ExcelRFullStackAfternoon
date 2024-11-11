package app1;

enum Day
{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}
class S
{
    public static void main(String[] args)
    {
        Day d1 = Day.SAT;
        System.out.println(d1);
        Day d2 = Day.SUN;
        System.out.println(d2);
    }
}
