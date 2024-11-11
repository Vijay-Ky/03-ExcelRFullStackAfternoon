class U
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		double value = 90.9;

		Double d1 = Double.valueOf(value);
		double d2 = d1.doubleValue();

		System.out.println(d2);

		System.out.println("done");
	}
}
