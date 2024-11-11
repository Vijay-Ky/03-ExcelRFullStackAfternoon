class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int[] x = {10, 20, 30, 40};
			int i = x[4];
			System.out.println("try end");
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("from catch");
		}
		System.out.println("end of main");
	}
}
