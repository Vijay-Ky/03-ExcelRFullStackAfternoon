class K
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		System.out.println(s1);
		String s2 = s1.toLowerCase();//string modification resulting in a new object creation.
		System.out.println(s1 == s2);
	}
}