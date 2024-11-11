package app1;
class I
{
	static void test()
	{
		System.out.println("test begin");
		int i = 10/0;
		System.out.println("test end");
	}
}
class J
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		I.test();
		System.out.println("main end");
	}
}
