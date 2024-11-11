public class X
{
	static void test(int x, String...y)
	{
		System.out.print("x value: " + x);
		System.out.println(" and length of the var-arg y : " + y.length);
		System.out.println("----------");
	}
	public static void main(String [] args)
	{
		//test();
		test(10);
		test(1,"abc");
		test(30,"xyz","hello");
		test(40,"done","check","hello");
	}
}
