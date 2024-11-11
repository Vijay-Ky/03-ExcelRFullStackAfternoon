class S
{
	static void test() throws Throwable
	{
		Class.forName("");
	}
	public static void main(String[] args) throws Exception 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
