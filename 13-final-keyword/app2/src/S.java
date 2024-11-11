class S
{
	final int i;

	S()
	{
		i = 10;
	}

	S(boolean b)
	{
		i = 20;
	}

	public static void main(String[] args) 
	{
		S s1 = new S();
		S s2 = new S(true);
		System.out.println(s1.i);
		System.out.println(s2.i);
		System.out.println("done");
	}
}
