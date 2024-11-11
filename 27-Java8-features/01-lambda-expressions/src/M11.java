interface A
{
	int test();
}
class M11
{
	public static void main(String[] args) 
	{
		A a1 = () -> 200;
	
		int i = a1.test();
		System.out.println("done with :" + i);
	}
}
