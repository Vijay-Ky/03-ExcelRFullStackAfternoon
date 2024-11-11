public class Q
{
	static void test(Long d1)
	{
		System.out.println("Long");
	}
	static void test(double d1)
	{
		System.out.println("double");
	}
	public static void main(String [] args)
	{
		long lon = 10;
		test(lon);
	}
}
