class Q
{
	static
	{
		System.out.println(i = 20);
	}

	static final int i; 

	static
	{
		System.out.println(i = 25);//variable i might already have been assigned
	}
}
