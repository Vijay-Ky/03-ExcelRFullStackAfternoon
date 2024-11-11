class J
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		System.out.println(s1);
		s1.toLowerCase();//string modification resulting in a new object creation.
		System.out.println(s1);
	}
}