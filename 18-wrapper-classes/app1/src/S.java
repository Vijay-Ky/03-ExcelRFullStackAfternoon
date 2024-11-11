class S
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		int i = 10;
		String str = "20";

		Integer obj1 = new Integer(i);
		Integer obj2 = new Integer(str);

		int j = obj1.intValue();
		int k = obj2.intValue();

		System.out.println(j);
		System.out.println(k);
	}
}
