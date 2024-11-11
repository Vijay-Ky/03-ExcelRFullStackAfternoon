class H
{
	static int i;
	static
	{
		//i = j;
		j = i;
	}
	static int j = 40;
	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
	}
}
