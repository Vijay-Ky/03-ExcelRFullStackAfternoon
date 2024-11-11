public class E
{
	//widening would be considered
	static void test(double i)
	{
		System.out.println("double");
	}
	static void test(Integer i)
	{
		System.out.println("Integer");
	}
	public static void main(String [] args)
	{
		int i = 10;
		test(i);
	}
}
	
