class E
{
	static void test1()
	{
		System.out.println("from test1.E");
	}
}
class F extends E
{
	static void test1()
	{
		System.out.println("from test1.F");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.test1();
	}
}
