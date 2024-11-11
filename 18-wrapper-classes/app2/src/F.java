class F 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Integer obj1 = new Integer(10);
		int i = obj1.intValue();

		Integer obj2 = obj1;

		System.out.println(i == obj2);
		System.out.println("done");
	}
}
