class J
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Boolean b1 = new Boolean(true);
		if (b1)
		{
			System.out.println("from if1");
		}
		if (b1.booleanValue())
		{
			System.out.println("from if2");
		}
	}
}
