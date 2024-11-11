class D
{
	static void test() 
	{
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("from catch");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
