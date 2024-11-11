interface A
{
	void test(int i);
}
class M7
{
	public static void main(String[] args) 
	{
		A a1 = (int x) -> System.out.println("from test:" + x);
		a1.test(10);
		System.out.println("done");
	}
}
