class C
{
	static int i;
	static void test()
	{
		System.out.println("from test: " + i);
	}
}
class D
{
	public static void main(String[] args)
	{
		System.out.println("from main: " + C.i);
		C.test();
	}
}

/*
- we call static members outside the class as well but we need to call them along with the class reference.

*/