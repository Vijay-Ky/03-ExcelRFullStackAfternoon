class I
{
	static void test(Character ch)
	{
		System.out.println("value: " + i);
	}

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		test('a');
		char ch1 = 'b';
		test(ch1);
		Character ch2 = 'c';
		test(ch2)
	}
}
