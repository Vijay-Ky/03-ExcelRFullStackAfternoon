class H
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
		finally
		{
			System.out.println("outer finally begin");
			try
			{	
			}
			finally
			{
				System.out.println("nested finally");
			}
			System.out.println("outer finally end");
		}
		System.out.println("main end");
	}
}
