class A
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10 / 0;//un-checked
			main(null);//Error
			Class.forName("");//checked
		}
		catch (Throwable ex)
		{
		}
		System.out.println("main end");
	}
}
//Exception cant handle Error
//Error cant handle Exception
//but both will be handled by Throwable