class Z5
{
    static int i = test1();
    static int test1()
    {
		System.out.println("from test1");
		main(null);
        return 10;
    }
    public static void main(String[] args)
    {
		System.out.println("from main");
		System.out.println(i);
	}
}

/*
Q: is there any possiblility of executing main method before it gets automatically executed by the JVM??

A: Yes. Possible. we call main method from the static method by supplying 'null' as the argument.
*/
