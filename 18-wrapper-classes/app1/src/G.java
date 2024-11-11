class G 
{
	public static void main(String[] args) 
	{
		String s1 = "10";
		String s2 = "20";

		Integer obj1 = new Integer(s1);
		Integer obj2 = new Integer(s2);
		
		Integer obj3 = new Integer("30");
		Integer obj4 = new Integer("40");

		int i = obj1.intValue();
		int j = obj2.intValue();
		int k = obj3.intValue();
		int l = obj4.intValue();

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}
