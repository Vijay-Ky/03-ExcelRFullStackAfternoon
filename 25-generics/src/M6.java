class F <Test>
{
	Test i;
	void method1(Test t)
	{
		System.out.println("method1");
	}
}
class M6
{
	public static void main(String [] args)
	{
		F <String> f1 = new F <String> ();
		F <Integer> f2 = new F <Integer> ();
		f1.method1("abc");
		f2.method1(100);
		f1.i = "xyz";
		f2.i = 123;
		System.out.println("done");
	}
}