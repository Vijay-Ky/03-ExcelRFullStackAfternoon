class Z4
{
	static int i = test1();
	static int test1()
	{
		System.out.println("from test1");
		return 10;
	}	
	static void test2()
	{
		System.out.println("from test2");
	}

	public static void main(String[]args)
	{
		System.out.println(i);
		System.out.println(test1());
		System.out.println(test2());
	}
}

/*
- we can call methods inside the SOP in such case method execution will happen as well as return value will be printed
- condition to met is compulsary that method must return a value.
*/
