class W
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		String value = "b";

		Character c1 = Character.valueOf(value);
		char c2 = c1.charValue();

		System.out.println(c2);
		System.out.println("done");
	}
}
