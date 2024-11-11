class C 
{
	int i;
}
class M2
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.i = 10;
		C c2 = new C();
		c2.i = 20;
		System.out.println(c1);
		System.out.println(c2);
	}
}
