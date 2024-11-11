class V 
{
	public static void main(String[] args) 
	{
		double i = 10.2;
		float f = (byte)(double)(byte)(short)(int)(long)(double)(float)(double)i;
		System.out.println(f);
	}
}