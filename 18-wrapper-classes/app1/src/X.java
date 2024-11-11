class X 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		byte b = 10;
		String s1 = Byte.toString(b);
		System.out.println(s1);
		System.out.println("------");
		short s = 100;
		String s2 = Short.toString(s);
		System.out.println(s2);
		System.out.println("------");
		int i = 1000;
		String s3 = Integer.toString(i);
		System.out.println(s3);
		System.out.println("------");
		long l = 10000;
		String s4 = Long.toString(l);
		System.out.println(s4);
		System.out.println("------");
		float f = 10.0F;
		String s5 = Float.toString(f);
		System.out.println(s5);
		System.out.println("------");
		double d = 10;
		String s6 = Double.toString(d);
		System.out.println(s6);
		System.out.println("------");
		char c = 'a';
		String s7 = Character.toString(c);
		System.out.println(s7);
		System.out.println("------");
		boolean booleanValue = false;
		String s8 = Boolean.toString(booleanValue);
		System.out.println(s8);
		System.out.println("------");
		System.out.println("done");
	}
}
