package app1;

import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter one int value: ");
		int i = sc.nextInt();
		System.out.println("Hello World! " + i);
	}
}
