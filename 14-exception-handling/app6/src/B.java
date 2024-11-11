class B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10 / 0;//un-checked
		}
		catch (ArithmeticException ex)
		{
		}
		System.out.println("main end");
	}
}
