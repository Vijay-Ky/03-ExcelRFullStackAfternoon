public class M
{
	static void test(Object i)
	{
		System.out.println("Object");
	}
	static void test(Number j)
	{
		System.out.println("Number");
	}
	public static void main(String [] args)
	{
		int i = 10;
		test(i);
	}
}
	
