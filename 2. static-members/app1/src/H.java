class H
{
	static int i;
	static void test()
	{
		System.out.println("from test: " + i);
	}
	public static void main(String[] args)
	{
		System.out.println("main: " + i);
		i = 10;
		test();
	}
}

/*
- we can call static methods directly, within the same class.
- methods are not going to be executed unless we call them explicitely.
*/
