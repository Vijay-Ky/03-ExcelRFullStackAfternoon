class Y 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		String s1 = "10";
		byte b = Byte.parseByte(s1);
		System.out.println(b);
		System.out.println("----------");
		String s2 = "100";
		int i = Integer.parseInt(s1);
		System.out.println(i);
		System.out.println("----------");
		String s3 = "100";
		short s = Short.parseShort(s3);
		System.out.println(s);
		System.out.println("----------");
		String s4 = "1000";
		long l = Long.parseLong(s4);
		System.out.println(l);
		System.out.println("----------");
		String s5 = "10.0F";
		float f = Float.parseFloat(s5);
		System.out.println(f);
		System.out.println("----------");
		String s6 = "10.0";
		double d = Double.parseDouble(s6);
		System.out.println(d);
		System.out.println("----------");
		String s7 = "True";
		boolean booleanValue = Boolean.parseBoolean(s7);
		System.out.println(booleanValue);
		System.out.println("----------");
	}
}
