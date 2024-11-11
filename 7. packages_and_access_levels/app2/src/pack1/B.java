package pack1;
class B 
{
	private int i;
}
class C extends B
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
	}
}
