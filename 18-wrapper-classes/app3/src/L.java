public class L
{
	static void test(Object i)
	{
		System.out.println("Object");
	}
	static void test(Number j)
	{
		System.out.println("Number");
	}
	static void test(Integer j)
	{
		System.out.println("Integer");
	}
	public static void main(String [] args)
	{
		int i = 10;
		test(i);
	}
}
	
