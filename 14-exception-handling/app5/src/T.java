class T
{
	static void test() throws Throwable
	{
		Class.forName("");
	}
	public static void main(String[] args) throws Throwable
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
//test() - Exception, main() - Exception
//test() - Exception, main() - Throwable
//test() - Throwable, main() - Throwable
