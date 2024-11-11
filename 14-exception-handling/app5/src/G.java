class G
{
	static void test1() 
	{
		test2();
	}
	static void test2() 
	{
		try
		{
			test3();
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("from test2 catch");
		}
		
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
