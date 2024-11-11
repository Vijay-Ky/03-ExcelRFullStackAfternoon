public class C
{
	//widening would be considered
	static void test(long j)
	{
		System.out.println("long");
	}
	static void test(byte k)
	{
		System.out.println("byte");
	}
	public static void main(String [] args)
	{
		int i = 10;
		test(i);
	}
}
	
