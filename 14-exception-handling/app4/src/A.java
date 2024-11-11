class A
{
	int test()
	{
		try
		{
			return 10;	
		}
		catch (ArithmeticException ex)
		{
			return 20;
		}
		return 30;
	}
}
