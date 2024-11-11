class R
{
	static void test(int i)
	{
		System.out.println("from R.test(int)");
	}
}
class S extends R
{
	static void test()
	{
		System.out.println("from S.test()");
	}

	public static void main(String[] args)
	{
		R r1 = new S();
		r1.test(10);
	}
}