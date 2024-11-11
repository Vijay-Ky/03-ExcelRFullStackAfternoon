class T 
{
	public static int test(double d)
	{
		System.out.println("test(double): " + d);
		return (int)d;
	}

	public static void main(String[] args) 
	{
		int i = test(2000); 
		long lon = test(10.0);
		System.out.println(i);
		System.out.println(lon);
	}
}
