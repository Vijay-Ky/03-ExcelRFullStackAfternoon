class J
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	static void test()
	{
		System.out.println("from test");
		return;
	}
}

/*
- for a method which is having void as the return type, we can keep return statement at last. which is optional.
*/