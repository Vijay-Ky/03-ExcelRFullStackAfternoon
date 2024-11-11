class O
{
    static int i;
    public static void main(String[]args)
    {
		System.out.println(O.i);
		O.i = 10;
		System.out.println(O.i);
     }
}
/*
- its a best practice to call the global static variables always with the class reference in order to avoid confusion with local variables which are with the same name as global ones.
*/