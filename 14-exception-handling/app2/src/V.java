import java.util.Scanner;
class V
{
	                //resources - Tap
	//System.out -> output stream - to dispaly the output
	//System.err -> error stream - to display the error
	//System.in -> input stream - to get the input
 	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("enter one int value");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		try
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			ex.printStackTrace(System.err);
			System.out.println("from catch: " + (i = 20));
		}
		finally
		{
			//best practice, to close the opened resource
			sc.close();
			System.out.println("enter another int value!");
			int j = sc.nextInt();
			System.out.println("from finally: " + (i = 40));
		}
		System.out.println("main end: " + i);
	}
}
