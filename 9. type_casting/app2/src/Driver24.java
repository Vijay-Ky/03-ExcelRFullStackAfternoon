class Driver24 
{
	public static void test(Object a1)
	{
		if(a1 instanceof Object)
		{
			if(a1 instanceof Object)
			{
				Object obj = (Object) a1;
				System.out.println("casting to Object");
			}

			if(a1 instanceof A)
			{
				A obj = (A) a1;
				System.out.println("casting to A");
			}

			if(a1 instanceof B)
			{
				System.out.println("casting to B");
				B obj = (B) a1;
			}

			if(a1 instanceof C)
			{
				System.out.println("casting to C");
				C obj = (C) a1;
			}
			if(a1 instanceof D)
			{
				System.out.println("casting to D");
				D obj = (D) a1;
			}
		}
	}

	public static void main(String[] args) 
	{
		Object obj1 = new Object();
		test(obj1);
		System.out.println("-------------------------");
		Object obj2 = new A();
		test(obj2);
		System.out.println("-------------------------");
		Object obj3 = new B();
		test(obj3);
		System.out.println("-------------------------");
		Object obj4 = new C();
		test(obj4);
		System.out.println("-------------------------");
		Object obj5 = new D();
		test(obj5);
		System.out.println("-------------------------");
	}
}
