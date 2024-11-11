import java.util.Scanner;
class O
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to your Account");
		System.out.println("Your Balance is 10,000.0 Rupees");
		System.out.println("Enter the amount to be withdrawn");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i > 10000)
		{
			throw new InsufficientBalanceException("your balance is 10,000 only!");
		}
		System.out.println("Thank you");
	}
}
