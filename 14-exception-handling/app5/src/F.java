class F
{
	static void test1() throws ClassNotFoundException
	{
		test2();
	}
	static void test2() throws ClassNotFoundException
	{
		test3();
	}
	static void test3() throws ClassNotFoundException
	{
		Class.forName("");
	}
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
