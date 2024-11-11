import java.util.Scanner;
class Y
{
 	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		try
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch begin: " + ex);
			ex = null;
			System.out.println("catch end: " + ex);
			Scanner sc = new Scanner(System.in);
			System.out.println("Scanner type ref: " + sc);
		}
		System.out.println("main end");
	}
}
