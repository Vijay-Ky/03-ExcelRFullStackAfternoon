import java.util.Scanner;
class Z
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
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
