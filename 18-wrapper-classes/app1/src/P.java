class P 
{
	public static void main(String[] args) 
	{
		String s1 = "true";
		String s2 = "false";
		String s3 = "10Z";
		String s4 = "TRUE";
		String s5 = "FALSE";
		String s6 = "TrUe";
		String s7 = "FaLsE";
		String s8 = "*****";
		String s9 = "11111";

		Boolean b1 = new Boolean(s1);
		Boolean b2 = new Boolean(s2);
		Boolean b3 = new Boolean(s3);
		Boolean b4 = new Boolean(s4);
		Boolean b5 = new Boolean(s5);
		Boolean b6 = new Boolean(s6);
		Boolean b7 = new Boolean(s7);
		Boolean b8 = new Boolean(s8);
		Boolean b9 = new Boolean(s9);

		boolean value1 = b1.booleanValue();
		boolean value2 = b2.booleanValue();
		boolean value3 = b3.booleanValue();
		boolean value4 = b4.booleanValue();
		boolean value5 = b5.booleanValue();
		boolean value6 = b6.booleanValue();
		boolean value7 = b7.booleanValue();
		boolean value8 = b8.booleanValue();
		boolean value9 = b9.booleanValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
	}
}
