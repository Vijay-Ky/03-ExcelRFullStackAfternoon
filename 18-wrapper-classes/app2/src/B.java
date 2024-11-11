class B 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Integer obj1 = new Integer(10);
		System.out.println(obj1);
		System.out.println("------------");

		Integer obj2 = 20;//new Integer(20);
		System.out.println(obj2);
		System.out.println("------------");

		Integer obj3 = new Integer(20);
		int i = obj3.intValue();
		System.out.println(i);
		System.out.println("------------");

		int j = new Integer(30);
		System.out.println(j);
		System.out.println("done");
	}
}
