class K
{
	static void test1() throws OutOfMemoryError
	{
		test2();
	}
	static void test2() throws NullPointerException
	{
		test3();
	}
	static void test3() throws ArithmeticException
	{
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
