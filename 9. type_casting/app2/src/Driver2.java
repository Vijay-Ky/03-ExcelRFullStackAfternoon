class Driver2 
{
	public static void main(String[] args) 
	{
		/*
		Object obj;
		A a1;
		B b1;
		C c1;
		D d1;*/

		//System.out.println(obj);
		//int i = null;
		
		//null can be only supplyed to reference variables
		//null is a primitive and can be assigned to any of the reference variables.
		//null represents abasence of a value
		//null is itself a value.
		//empty and null are not the same.
		Object obj = null;
		A a1 = null;
		B b1 = null;
		C c1 = null;
		D d1 = null;
		System.out.println(obj);

		obj = new Object();
		a1 = new A();
		b1 = new B();
		c1 = new C();

		System.out.println("done");
	}
}
