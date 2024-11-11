class B
{
	B()
	{
		//IIB
		System.out.println("B()");
	}
	//IIB(Intance Initialization Block)
	//if there is a common implementation for all the objects then we can keep it in the IIB
	{
		System.out.println("IIB");
	}
	public static void main(String[]args)
	{
		B b1 = new B();
		System.out.println("-----");
		B b2 = new B();
		System.out.println("-----");
	}
}