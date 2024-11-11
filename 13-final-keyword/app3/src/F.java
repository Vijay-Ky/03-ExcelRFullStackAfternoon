class E
{
	static void test()
	{
		System.out.println("E.test");
	}
}
class F extends E
{
	@Override
	static void test()
	{
		System.out.println("F.test");
	}

	public static void main(String[] args)
	{
		E e1 = new F();
		e1.test();
	}
}
