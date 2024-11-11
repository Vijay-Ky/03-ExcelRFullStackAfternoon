class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			Class.forName("");
			Thread.sleep(1000);
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("main end");
	}
}