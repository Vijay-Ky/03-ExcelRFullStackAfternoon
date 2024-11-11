class H
{
	static void test1() 
	{
		try
		{
			test2();
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("from test1 catch");
		}
	}
	static void test2() throws ClassNotFoundException
	{
		test3();
	}
	static void test3() throws ClassNotFoundException
	{
		Class.forName("");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
