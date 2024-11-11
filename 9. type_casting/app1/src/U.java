class U 
{
	public static void main(String[] args) 
	{
		double d1 = 20.0;
		float f1 = (float)d1;
		long lon = (long)f1;
		int i = (int)lon;
		short s = (short)i;
		byte b = (byte)s;

		System.out.println(d1);
		System.out.println(f1);
		System.out.println(lon);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
	}
}
