interface A
{
	int test();
}
class M10
{
	public static void main(String[] args) 
	{
		A a1 = () -> {
			System.out.println("from test");
			return 200;
		};
		int i = a1.test();
		System.out.println("done with :" + i);
	}
}
