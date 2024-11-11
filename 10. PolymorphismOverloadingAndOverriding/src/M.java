class L
{
	void test()
	{
		System.out.println("from L.test()");
	}
}
class M extends L
{
	void test()
	{
		System.out.println("from M.test()");
	}

	public static void main(String[] args)
	{
		M m1 = new M();
		m1.test();
	}
}