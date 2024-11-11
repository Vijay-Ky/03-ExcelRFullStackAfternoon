interface A
{
	void test();
}
class M2
{
	static class B implements A
	{
		public void test()
		{
			System.out.println("from test");
		}
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println(S"--------");
		B b2 = new B();
		b2.test();
		System.out.println("done");
	}
}
