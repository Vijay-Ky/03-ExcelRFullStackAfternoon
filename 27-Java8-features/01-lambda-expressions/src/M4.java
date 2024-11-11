interface A
{
	void test();
}
class M4
{
	public static void main(String[] args) 
	{
		//anonymous inner class
		//A a2 = new A();
		A a1 = new A()
		{
			public void test()
			{
				System.out.println("from test");
			}
		};
		a1.test();
		System.out.println("done");
	}
}
