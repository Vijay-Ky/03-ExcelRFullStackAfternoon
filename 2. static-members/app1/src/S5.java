class S5
{
	static int i;
	static int k = i;
	static int j = k;
	static int l = l;
	public static void main(String[] args)
	{
		
		System.out.println(i);
		System.out.println(j);
	}
}

/*
- you cant initialize the static variable with the same variable before it gets intialized, you will get 'self-reference in initializer' error 
- you cant initialize the variable with the same variable at the time of initialization.
*/
