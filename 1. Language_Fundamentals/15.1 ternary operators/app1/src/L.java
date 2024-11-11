import java.util.Scanner;
class L 
{
	public static void main(String[] args) 
	{
		int min = 0;
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();

		if(i < j)
		{
			min = i;
		}
		else if(i > j)
		{
			min = j;
		}
		else
		{
			System.out.println("Values are equal!");
		}
		System.out.println("Minimum value between " + "i " + i + " and " + "j : " + j + " is " + min);
	}
}
