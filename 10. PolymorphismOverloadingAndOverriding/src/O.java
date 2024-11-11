class N
{
	void test()
	{
		System.out.println("from N.test()");
	}
}
class O extends N
{
	void test()
	{
		System.out.println("from O.test()");
	}

	public static void main(String[] args)
	{
		N n1 = new O();
		n1.test();
	}
}