class A
{
	static
	{
		System.out.println("A-SIB");
	}
	{
		System.out.println("A-IIB");
	}
}

class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
	{
		System.out.println("B-IIB");
	}
}
class C extends B
{
	static
	{
		System.out.println("C-SIB");
	}
	{
		System.out.println("C-IIB");
	}
}
class Z extends C
{
	static
	{
		System.out.println("Z-SIB");
	}
	{
		System.out.println("Z-IIB");
	}
	public static void main(String[] args) 
	{
		Z z1 = new Z();
		System.out.println("main");
	}
}
