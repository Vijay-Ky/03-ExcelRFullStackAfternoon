class D
{
 	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			return;
		}
		int i;
		try
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch begin: ");
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
