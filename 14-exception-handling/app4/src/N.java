class N 
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
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
