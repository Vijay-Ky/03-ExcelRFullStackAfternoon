class W
{
	public static long test(double d)
	{
		return (long)d;
	}
	public static void main(String[] args) 
	{
		double i = 10.2;
		float f = test((byte)(double)(byte)(short)(int)(long)(double)(float)(double)i);
		System.out.println(f);
	}
}