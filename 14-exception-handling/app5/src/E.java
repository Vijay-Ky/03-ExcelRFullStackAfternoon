class E
{
	static void test() throws ClassNotFoundException
	{
		Class.forName("");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			test();
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
