class P
{
	void test()
	{
		System.out.println("from P.test()");
	}
}
class Q extends P
{
	void test()
	{
		System.out.println("from Q.test()");
	}

	public static void main(String[] args)
	{
		P p1 = new P();
		p1.test();
	}
}