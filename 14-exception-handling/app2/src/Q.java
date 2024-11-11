class Q
{
	static int test(int i)
	{
		try
		{
			System.out.println("from try begin");
			int k = i / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch: " + ex);
			return -1;
		}
		finally
		{
			System.out.println("from finally");	
		}
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("main end");
	}
}
