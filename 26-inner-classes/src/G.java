class G
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new G().new B();
		C c1 = new G.C();
		System.out.println("done");
	}
}
