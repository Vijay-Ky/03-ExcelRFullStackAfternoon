class T
{
	final int i;

	{
		i = 20;
	}

	public static void main(String[] args) 
	{
		S s1 = new S();
		S s2 = new S();
		System.out.println(s1.i);
		System.out.println(s2.i);
		System.out.println("done");
	}
}
