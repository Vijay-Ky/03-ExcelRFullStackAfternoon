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
class Z1 extends C
{
	static
	{
		System.out.println("Z1-SIB");
	}
	{
		System.out.println("Z1-IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		Z1 z1 = new Z1();
		System.out.println("main end");
	}
}
