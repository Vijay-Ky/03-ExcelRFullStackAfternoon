class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10 / 0;
		}
		catch (Error ex)
		{
		}
		System.out.println("main end");
	}
}
//Exception cant handle Error
//Error cant handle Exception
//but both will be handled by Throwable