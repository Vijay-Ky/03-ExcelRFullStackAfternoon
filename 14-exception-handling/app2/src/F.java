class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex1)
		{
			System.out.println("outer catch begin");
			try
			{
				int i = 10 / 0;
			}
			catch (ArithmeticException ex2)
			{
				System.out.println("from nested try-catch: " + ex2);
			}
			System.out.println("outer catch end");
		}
		System.out.println("main end");
	}
}
