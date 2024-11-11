class H
{
	static
	{
		System.out.println("H-SIB");
	}
	public static void main(String[] args)
	{
		System.out.println("H-main");
	}
}

/*
- static block or SIB(Static Intializer Block)
- all the static blocks will be executed from top to bottom only once for one execution. before the main method.
- static block should be outside the main method or any other method but within the class.
-we can have any no. of static blocks
- static blocks can be kepts before the main method or after the main method.

*/
