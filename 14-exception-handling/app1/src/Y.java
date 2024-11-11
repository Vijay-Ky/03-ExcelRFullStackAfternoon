class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int[] x = new int[9999999];
			System.out.println("try end");
		}
		catch (OutOfMemoryError ex)
		{
			System.out.println("from catch");
		}
		System.out.println("end of main");
	}
}
