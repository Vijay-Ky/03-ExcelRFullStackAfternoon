class U
{
	static int i = j;
	static int j = 10;
	public static void main(String[]args)
	{
		System.out.println(i);
		System.out.println(j);
	}
}

/*
- IFR(Illegal Forward Reference) error
- if you are trying to refer a static variable before its declaration or initializtion, you will be getting this IFR error.
*/
