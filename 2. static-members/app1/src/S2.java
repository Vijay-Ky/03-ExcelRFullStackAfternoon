class S2
{
	static int i;
	static int j = i = 10;
	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
	}
}

/*
- compound assignment is possible for static variables at the class context.
*/
