class D
{
	int i;

	public String toString()
	{
		return "i value: " + i;
	}
}
class M3
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.i = 10;
		System.out.println(d1);
		String s1 = "info: " + d1;
		System.out.println(s1);
	}
}
