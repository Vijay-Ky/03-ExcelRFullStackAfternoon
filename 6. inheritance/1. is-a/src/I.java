class G
{
	static void test1()
	{
		System.out.println("G-test1()");
	}
}
class H extends G 
{
	//test1() from G
	static void test2()
	{
		System.out.println("H-test2()");
	}

	public static void main(String[] args1) 
	{
		System.out.println("begin form H");
		H.test1();
		H.test2();
		System.out.println("end form H");
	}
}
class I extends H
{
	//test1() and test2() from H
	static void test3()
	{
		System.out.println("I-test3()");
	}

	public static void main(String[] args) 
	{
		I.test1();
		I.test1();
		I.test1();
		I.main(args);
	}
}