class S
{
	public static void test(int i)
	{
		System.out.println("test(int): " + i);
	}

	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		double d1 = 10.0;
		test((int)d1);
		System.out.println("done");
	}
}
