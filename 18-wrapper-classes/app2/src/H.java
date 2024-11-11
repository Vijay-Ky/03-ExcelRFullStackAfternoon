class H
{
	static void test(int i)
	{
		System.out.println("done: " + i);
	}

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Integer obj = new Integer(10);
		test(obj);
		test(new Integer(20));
		test(obj.intValue());
	}
}
