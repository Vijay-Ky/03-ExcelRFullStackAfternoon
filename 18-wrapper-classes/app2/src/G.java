class G 
{
	static void test(Integer obj)
	{
		System.out.println("done: " + obj);
	}

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		test(20);
		test(new Integer(20));
	}
}
