class T
{
	static int count = 0;
	static void test()
	{
		System.out.println("from T.test()");
	}
}
class U extends T
{
	static int count = 10;
	static void test()
	{
		System.out.println("from U.test()");
	}

	public static void main(String[] args)
	{
		
		T t1 = new U();
		t1.test();
		System.out.println(t1.count);
		U u1 = new U();
		System.out.println(.count);

	}
}
//in case of non-static methods object creation matters, but in static methods reference matters
//static members are not involving in polymorhism
//static (members)methods cannot be overridden, so they cannot participate in dynamic polymorphism. This is because static members are bound to the class itself, not to any specific object.