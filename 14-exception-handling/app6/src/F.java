class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("main end");
	}
}