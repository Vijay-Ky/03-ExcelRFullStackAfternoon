class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		try
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			ex.printStackTrace(System.err);
			System.out.println("from catch: " + (i = 20));
		}
		finally
		{
			System.out.println("from finally: " + (i = 40));
		}
		System.out.println("main end: " + i);
	}
}
