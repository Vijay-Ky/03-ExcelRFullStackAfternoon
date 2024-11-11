public class M
{
	static void test(int i)
	{
		System.out.println("int");
	}
	static void test(double j)
	{
		System.out.println("double");
	}
	public static void main(String [] args)
	{
		int i = 20;
		test(i);
	}
}
