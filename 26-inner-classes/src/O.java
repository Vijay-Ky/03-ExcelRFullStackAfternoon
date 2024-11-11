class O 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 20;
		class A
		{
			void test()
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		i = 40;
		System.out.println("done: " + i);
		System.out.println("done: " + j);
	}
}
