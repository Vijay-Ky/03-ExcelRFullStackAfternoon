class A
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class C
{
	//has-a reference to A
	A obj;
	void test2()
	{
		System.out.println("C-test2");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test2();
	}
}
