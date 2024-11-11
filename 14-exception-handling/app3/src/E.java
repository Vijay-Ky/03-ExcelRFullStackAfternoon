class E
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
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}

/*possible combinations
try-catch
try-catches
try-catch-finally
try-catches-finally
try-finally
*/
