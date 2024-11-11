class C
{
	static void test() throws ClassNotFoundException
	{
		Class.forName("");
	}

	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
