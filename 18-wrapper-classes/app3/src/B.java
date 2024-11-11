public class B
{
	//since there are no other-options widening would be considered
	static void test(double j)
	{
		System.out.println("double");
	}
	public static void main(String [] args)
	{
		int i = 10;
		test(i);
	}
}
	
