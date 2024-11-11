class C
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
		catch (NullPointerException ex)
		{
			return 30;
		}
		return 40;
	}
}
