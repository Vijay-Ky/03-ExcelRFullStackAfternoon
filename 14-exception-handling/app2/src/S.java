class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("from try begin");
			int i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			i = 20;
		}
		System.out.println("main end");
	}
}
