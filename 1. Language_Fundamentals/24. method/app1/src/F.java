class F
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test1();
		System.out.println("----------");
		test1();
		System.out.println("main end");
	}
	public static void test1()
	{
		System.out.println("from test1");
	}
}
/*
- method execution will be following the stack operation.
- variables and methods are processed inside stack memory.
- we can call the same method any no. of times.
*/
