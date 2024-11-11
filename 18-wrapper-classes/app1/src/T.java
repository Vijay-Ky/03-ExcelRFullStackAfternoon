class T 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		String s1 = "90.9";

		Double d1 = Double.valueOf(s1);
		double d2 = d1.doubleValue();

		System.out.println(d2);

		System.out.println("done");
	}
}
