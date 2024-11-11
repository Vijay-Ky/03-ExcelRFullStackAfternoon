class Z
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		String str = "10.0";
		float f = Float.parseFloat(str);
		System.out.println(f);
		System.out.println("----------");
		double d = Double.parseDouble(str);
		System.out.println(d);
		System.out.println("done");
	}
}
