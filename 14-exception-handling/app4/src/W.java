class W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			Thread.sleep(1000);	
		}
		catch (InterruptedException ex)
		{
			System.out.println("from catch");	
		}
		System.out.println("main end");	
	}
}
