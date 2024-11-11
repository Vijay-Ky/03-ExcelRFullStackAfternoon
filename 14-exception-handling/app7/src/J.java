class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			throw new ArithmeticException(" we are terminating the flow by raising an exception explicitely");
		}
		System.out.println("main end");
	}
}
