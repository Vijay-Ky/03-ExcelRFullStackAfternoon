class A 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		String s1 = "abc123";
		String s2 = "True";
		String s3 = "FLASE";
		String s4 = "False";

		boolean b1 = Boolean.parseBoolean(s1);
		boolean b2 = Boolean.parseBoolean(s2);
		boolean b3 = Boolean.parseBoolean(s3);
		boolean b4 = Boolean.parseBoolean(s4);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
