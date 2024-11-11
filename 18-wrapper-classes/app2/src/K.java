class K 
{
	static Integer test(int i)
	{
		return i;//new Integer(20);
	}

	public static void main(String[] args) 
	{
		Integer obj1 = new Integer(10);
		test(obj1);
		Integer obj2 = test(20);
		System.out.println(obj1);//10
		System.out.println(obj2);//20
		System.out.println(obj1 == obj2);
	}
}
