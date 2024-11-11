class N
{
	static int i = 10;
	public static void main(String[]args)
	{
		int i = 20;
		System.out.println(i);
		System.out.println(N.i);
	}
}

/*
- in the global and in the local we can have variable with the same name, and with the same datatype or different datatype, both are in the different context. which is why it is possible.

- we can refer global static variable with the class reference.
*/
