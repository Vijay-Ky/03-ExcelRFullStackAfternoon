class P
{
	void test()
	{
		try
		{
			clone();
		}
		catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P();
		p1.test();
		System.out.println("main end");
	}
}
