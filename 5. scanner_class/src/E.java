import java.util.Scanner;
class E
{

	void test()
	{
		System.out.println("from test");
	}

	public static void main(String[] args) 
	{
		System.out.println("enter two boolean values value");

		E e1 = new E();
		e1.test();
		e1.test();
		System.out.println("------------------------");

		Scanner sc = new Scanner(System.in);
		
		//TRUE or true and FALSE or false(case doesnt matter)
		//mixed case also possible
		boolean b1 = sc.nextBoolean();
		boolean b2 = sc.nextBoolean();
		System.out.println("------------------------");
		
		System.out.println("the first input: " + b1);
		System.out.println("the second input: " + b2);

		//close the resource
		//good practice to close the opened resource after using it.
		sc.close();
	}
}
