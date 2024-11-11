class C 
{
	 void test()
	{
		System.out.println("C.test");
	}
}
class D extends C
{
	void test()
	{
		System.out.println("D.test");
	}

	public static void main(String[] args)
	{
		C c1 = new D();
		c1.test();
	}
}
