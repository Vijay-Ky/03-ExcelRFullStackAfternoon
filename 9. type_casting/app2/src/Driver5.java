class Driver5 
{
	//method return type can class type
	//can any primitive type or class type
	static D test1()
	{
		D d1 = new D();
		System.out.println(d1);
		return d1;
	}
	//if the method return type is class type while returning value at last, that method can accept the reference of same type and it can accept an object of same type 

	//while returning we can create the object
	//methods can hold any type of data according to the return type.

	static A test2()
	{
		return new A();
	}

	public static void main(String[] args) 
	{
		D d1 = test1();
		A a1 = test2();
		System.out.println(d1);
		System.out.println(a1);

		System.out.println("---------------------");

		D d2 = test1();
		A a2 = test2();
		System.out.println(d2);
		System.out.println(a2);
	}
}
