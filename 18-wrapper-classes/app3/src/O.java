public class O
{
	//first preference goes to same type
	/*static void test(byte i)
	{
		System.out.println("byte");
	}*/
	/*static void test(short i)
	{
		System.out.println("short");
	}
	static void test(int i)
	{
		System.out.println("int");
	}*/
	/*static void test(Byte b)
	{
		System.out.println("Byte");
	}*/
	/*
	static void test(Double d1)
	{
		System.out.println("Double");
	}*/
	/*static void test(Number n1)
	{
		System.out.println("Number");
	}*/
	/*static void test(Object obj)
	{
		System.out.println("Object");
	}*/
	static void test(byte...b)
	{
		System.out.println("var-arg");
	}
	public static void main(String[] args)
	{
		byte b1 = 10;
		test(b1);
	}
}
	
