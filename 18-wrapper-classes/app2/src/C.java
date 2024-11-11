public class C
{
	@SuppressWarnings("removal")
	public static void main(String [] args)
	{
		String s1 = "abc";
		String s2 = "true";
		String s3 = "TRUE";
		String s4 = "False";
		String s5 = "@@123";

		boolean b1 = Boolean.parseBoolean(s1);
		boolean b2 = Boolean.parseBoolean(s2);
		boolean b3 = Boolean.parseBoolean(s3);
		boolean b4 = Boolean.parseBoolean(s4);
		boolean b5 = Boolean.parseBoolean(s5);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}
}
 