class J
{
	static void test()
	{
		System.out.println("from J.test()");
	}
}
class K extends J
{
	static void test()
	{
		System.out.println("from K.test()");
	}

	public static void main(String[] args)
	{
		K k1 = new K();
		k1.test();
	}
}