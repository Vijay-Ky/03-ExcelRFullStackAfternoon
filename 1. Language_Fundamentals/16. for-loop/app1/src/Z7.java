class Z6
{
	public static void test(int j)
	{
		for (int i = j; (false && true); i++)
		{
			System.out.println("from if" + i);
		}
	}
	public static void main(String[] args) 
	{
		test(0);
		System.out.println("Z4 main");
	}
}
class Z7
{
	public static void main(String[] args) 
	{
		Z6.test(-10);
	}
}
