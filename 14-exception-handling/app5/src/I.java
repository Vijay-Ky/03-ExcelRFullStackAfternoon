class I
{
	static void test1() throws ClassNotFoundException
	{
		test2();
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
		try
		{
			test1();
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("from test1 catch");
		}
		System.out.println("main end");
	}
}
